class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> answer = new ArrayList<>();
        int length = nums.length;
        Arrays.sort(nums);
        if(length<4||(long)nums[0]*4>target||(long)nums[length-1]*4<target) return answer;

        for(int a=0;a<length-3;a++) {
            if(a>0&&nums[a]==nums[a-1]) continue;
            for(int b=a+1;b<length-2;b++){
                if(b>a+1&&nums[b]==nums[b-1]) continue;
                int start = b+1, end = length-1;
                while(start<end) {
                    long sum = (long)nums[start]+(long)nums[end]+(long)nums[a]+(long)nums[b];
                    if(sum>target) {
                        end--;
                    }
                    else if(sum<target){
                        start++;
                    }
                    else {
                        answer.add(Arrays.asList(nums[a],nums[b],nums[start],nums[end]));
		                while(start<end&&nums[start]==nums[start+1]) {
		                    start++;
		                }
		                while(start<end&&nums[end]==nums[end-1]) {
		                    end--;
		                }
                        start++;
                        end--;
                    }
                }
            }
        }
        return answer;
    }
}