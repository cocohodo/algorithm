class Solution {
    public int reverse(int x) {
        int num = x;
        long answer = 0;
        while(num!=0) {
            answer*=10;
            answer+= num % 10;
            num/=10;
        }
        if(2147483647<answer || -2147483648>answer) return 0;
        return (int)answer;
    }
}