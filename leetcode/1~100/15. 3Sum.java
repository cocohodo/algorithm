//정렬한 후에 더해서 크면 끝부분을 줄이고 작으면 작은부분을 올린다.
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        Set<List<Integer>> temp = new HashSet<>();
        Arrays.sort(nums);
        int length = nums.length;
        for(int a=0;a<length-1;a++) {
            int start = a+1, end = length-1;
            while(start<end) {
                if(nums[start]+nums[end]==-nums[a]) {
                    temp.add(Arrays.asList(nums[a],nums[start],nums[end]));
                    start++;
                    end--;
                }
                else if(nums[start]+nums[end]>-nums[a]) {
                    end--;
                }
                else {
                    start++;
                }
            }
        }
        answer.addAll(temp);
        return answer;

    }
}