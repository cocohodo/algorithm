class Solution {
    public boolean isPalindrome(int x) {
        String x2 = Integer.toString(x);
        int length = x2.length();
        for(int a=0;a<length/2;a++) {
            if(x2.charAt(a)!=x2.charAt(length-a-1)) return false;
            if(length-a-a<=1) return true;
        }
        return true;
    }
}