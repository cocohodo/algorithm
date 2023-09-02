/*
Median의 정의
어떠한 수의 집합을 (1) 같은 크기의 둘로 나누되,
(2) 한쪽은 median보다 작거나 같게, 다른 한 쪽은 median보다 크거나 같게 나누는 방법 

두 배열을 각각 왼쪽 그룹과 오른쪽 그룹으로 나눈다
총 개수가 홀수개면 왼쪽 그룹 중에서 가장 큰 값
짝수개면 (왼쪽 그룹 중 가장 큰 값 + 오른쪽 그룹 중 가장 작은 값) / 2
*/

import java.lang.Math;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double maxLeft1, minRight1, maxLeft2, minRight2;
        int nums1index, nums2index;
        if (nums1.length > nums2.length)
            {
            	int[] temp = nums1;
                nums1 = nums2;
                nums2 = temp;
            }
        int medianLength = (nums1.length + nums2.length + 1) / 2;
        int start = 0;
        int end = nums1.length;

        while(start<=end) {
            //nums1왼쪽이 커지면 nums2오른쪽도 커져야 한다. - 두 그룹 개수 유지
            nums1index = (start + end) / 2;
            nums2index = medianLength - nums1index;

            //인덱스가 0 이면 가장 작은 값 넣기
            if (nums1index==0) maxLeft1 = -1000001;
            else maxLeft1 = nums1[nums1index-1];
            //인덱스가 배열 끝이면 가장 큰 값 넣기
            if (nums1index==nums1.length) minRight1 = 1000001;
            else minRight1 = nums1[nums1index];

            if (nums2index==0) maxLeft2 = -1000001;
            else maxLeft2 = nums2[nums2index-1];
            if (nums2index==nums2.length) minRight2 = 1000001;
            else minRight2 = nums2[nums2index];
            //정답일 경우
            if(maxLeft1<=minRight2 && maxLeft2<=minRight1) {
                if((nums1.length+nums2.length) % 2 == 0) 
                    return (Math.max(maxLeft1,maxLeft2) + Math.min(minRight1,minRight2)) / 2;
                else 
                    return Math.max(maxLeft1,maxLeft2);
            }
            // 왼쪽 그룹 값이 너무 큰 경우 end값 줄임
            else if (maxLeft1 > minRight2) {
                end = nums1index - 1;
            }
            else {
                start = nums1index + 1;
            }


        }
        
        return 0.0;
    }
}