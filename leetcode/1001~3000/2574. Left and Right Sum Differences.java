class Solution {
    public int[] leftRigthDifference(int[] nums) {
        int[] answer = new int[nums.length];
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        for (int a=1,b=nums.length-2;a<nums.length;) {
            left[a]=left[a-1]+nums[a-1];
            right[b]=right[b+1]+nums[b+1];
            a++;b--;
        }
        for (int a=0;a<nums.length;a++) {
            answer[a]=left[a]-right[a];
            if (answer[a]<0) answer[a]*=-1;
        }
        return answer;
    }
}