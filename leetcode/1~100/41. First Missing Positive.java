//자기 자리에 맞는 배열 칸(i-1)으로 바꿔서 넣는 것을 반복하고 전체 반복을 통해 자기 칸에 맞는 숫자(i+1)가 없으면 i+1이 최초로 없는 양수값이 된다.
class Solution {
    public int firstMissingPositive(int[] nums) {
        int len = nums.length;
        for(int i=0; i<len;) {
            int now = nums[i] - 1;
            if(nums[i]>0 && now<len && nums[i]!=nums[now]) {
                int temp = nums[i];
                nums[i] = nums[now];
                nums[now] = temp;
            }
            else i++;
        }

        for (int i = 0; i < len; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }

        return len + 1;
    }
}