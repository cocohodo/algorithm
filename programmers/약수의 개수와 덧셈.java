class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        Double number;
        for(int a = left;a<=right;a++) {
            number = Math.sqrt(a);
            if(number==number.intValue()) answer-=a;
            else answer+=a;
        }
        return answer;
    }
}