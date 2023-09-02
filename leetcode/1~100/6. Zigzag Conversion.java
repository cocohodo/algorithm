class Solution {
    public String convert(String s, int numRows) {
        int num = numRows + numRows - 2;
        String answer = "";
        if(numRows==1) return s;
        for(int a = 0; a<numRows;a++) {
            if(a==0||a==numRows-1) {
                for(int b = 0; a+b*num < s.length(); b++) {
                    answer += s.substring(a+b*num,a+b*num+1);
                }
            }
            else {
                for(int b = 0; b*num-a<s.length();b++) {
                    if(b!=0) answer += s.substring(b*num-a,b*num-a+1);
                    if(a+b*num >= s.length()) break;
                    answer += s.substring(a+b*num,a+b*num+1);
                }
            }
        }
        return answer;
    }
}