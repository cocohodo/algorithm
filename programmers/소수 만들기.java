class Solution {
    public boolean isprime(int maybe) {
        for(int a=2;a<maybe;a++) {
            if(maybe%a==0) {
                return false;
            }
        }
        return true;
    }
    public int solution(int[] nums) {
        int answer = 0;
        for(int a=0;a<nums.length;a++) {
            for(int b=a+1;b<nums.length;b++) {
                for(int c=b+1;c<nums.length;c++) {
                    if(isprime(nums[a]+nums[b]+nums[c])){
                        answer++;
                    }
                }
            }
        }

        return answer;
    }
}