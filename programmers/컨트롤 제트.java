class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] number = s.split(" ");
        for(int i = 0;i<number.length;i++) {
            if(number[i].equals("Z")) {
                answer -= Integer.valueOf(number[i-1]);
            }
            else answer += Integer.valueOf(number[i]);
        }
        return answer;
    }
}