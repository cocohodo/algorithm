class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] acheck = new int[128];
        int count=0,max=0,left=0;
        char[] chars = s.toCharArray();
        for(char c: chars) {
            if (acheck[Integer.valueOf(c)]==0) {
                count++;
                acheck[Integer.valueOf(c)]=1;
            }
            else {
                if(count>max) max = count;
                while(!(c==chars[left])) {
                	acheck[chars[left]] = 0;
                	left++;
                	count--;
                }
                left++;
            }
        }
        if(count>max) return count;
        return max;
    }
}