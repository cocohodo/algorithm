class Solution {
    public int strStr(String haystack, String needle) {
        for(int i = 0; i<haystack.length()-needle.length()+1;i++) {
            if(haystack.charAt(i)==needle.charAt(0)) {
                boolean answer = check(haystack,needle,i);
                if (answer==true) return i;
            }
        }
        return -1;
    }
    public boolean check(String haystack, String needle,int index) {
        for(int i = 1; i<needle.length();i++) {
            if(haystack.charAt(index+i)!=needle.charAt(i)) return false;
        }
        return true;
    }
}