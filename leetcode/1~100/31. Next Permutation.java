//뒤에서부터 시작해서 현재 숫자보다 앞에 숫자가 더 작으면 앞 숫자보다 크면서 제일 작은 숫자랑 자리를 바꾸고 현재 자리부터 맨끝자리랑 뒤집기
class Solution {
    public void nextPermutation(int[] nums) {
        if(nums.length==1) return;
        int num = 101;
        int which = nums.length-1;

        for(int i = nums.length-2; i >= 0; i--) {
            if(nums[i]<nums[i+1]){
                for(int j = nums.length-1; j>=i;j--) {
                    if(num>nums[j]&&nums[i]<nums[j]) {num = nums[j]; which = j;}
                }
                int temp = nums[which];
                nums[which] = nums[i];
                nums[i] = temp;
                reverse(i+1,nums.length-1,nums);
                return;
            }
            if(i==0){ 
                reverse(0,nums.length-1,nums);
                return;
            }
        }
    }
    public void reverse(int l, int r, int[] nums) {
        while(l < r) {
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++; r--;
        }
    }
}
/*
1 2 3 4
1 2 4 3
1 3 2 4
1 3 4 2
1 4 2 3
1 4 3 2
2 1 3 4
2 1 4 3
2 3 1 4
2 3 4 1
2 4 1 3
2 4 3 1
3 1 2 4
*/