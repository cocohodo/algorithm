class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] answer = {-1,-1};
        int len = nums.length;
        int mid = binarySearch(target,0,len-1,nums);
        if(mid==-1) return answer;
        for(int i = mid; i<len;i++) {
            if(nums[i]==target&&answer[0]==-1) {
                answer[0] = i;
            }
            if(answer[0]!=-1&&nums[i]==target) {
                answer[1] = i;
            }
            if(answer[0]!=-1&&nums[i]!=target) break;
        }
        return answer;
    }
    public int binarySearch(int target, int low, int high,int[] arr) {
	int mid;

	while(low <= high) {
		mid = (low + high) / 2;

		if(target == arr[mid]) {
            while(mid>=0&&arr[mid]==target) {mid--;}
			return mid+1;
		} 
        else if(target < arr[mid]) {
			high = mid - 1;
		} 
        else {
			low = mid + 1;
		}
	}

	return -1; // 탐색 실패 
}
}