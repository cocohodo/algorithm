//max : target하고 nums 3개 합친 것의 차이
//target이 -2이고 sum이 4이면 max는 6
//target -2이고 sum -4이면 max는 2
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int length = nums.length;
        int answer=0;
        int max=30000;

        for(int a=0;a<length-1;a++) {
            int start = a+1, end = length-1;
            while(start<end) {
                int sum = nums[start]+nums[end]+nums[a];
                //최고 max가 작으면 갱신
                if(max>Math.abs(target-sum)) {
                    answer=sum;
                    max=Math.abs(target-sum);
                }
                if(sum==target) {
                    return target;
                }
                else if(sum>target) {
                    end--;
                }
                else {
                    start++;
                }
            }
        }
        return answer;
    }
}