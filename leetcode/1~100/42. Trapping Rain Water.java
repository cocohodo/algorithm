//무조건 작은 쪽이 움직임
class Solution {
    public int trap(int[] height) {
        int water = 0;
        int left = 0, right = height.length - 1;
        int lMax = height[left], rMax = height[right];
        while(left<right) {
            if(lMax<rMax) {
                left++;
                if(height[left]>lMax) {
                    lMax = height[left];
                }
                else {
                    water += lMax - height[left];
                }
            }
            else {
                right--;
                if(height[right]>rMax) {
                    rMax = height[right];
                }
                else {
                    water += rMax - height[right];
                }
            }
        }
        return water;
    }
}