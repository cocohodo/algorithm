class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> answer = new ArrayList<>();
        if(digits.length()==0) return answer;
        String[] alphabet = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        StringBuilder temp = new StringBuilder();
        combination(digits,0,alphabet,answer,temp);
        return answer;
    }
    public static void combination(String digits,int index,String[] alphabet,List<String> answer,StringBuilder temp) {
        if(index==digits.length()) {
            answer.add(temp.toString());
            return;
        }
        String button = alphabet[digits.charAt(index)-'0'];
        //더하고 재귀 시작하고 다시 빼서 다른 문자로 반복
        for(int a = 0;a<button.length();a++) {
            temp.append(button.charAt(a));
            combination(digits,index+1,alphabet,answer,temp);
            temp.deleteCharAt(temp.length()-1);
        }
    }
}