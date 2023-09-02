class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix="";
        if(strs.length==1) return strs[0];
        Loop1:
        for(int a=0;a<strs[0].length();a++) {
            Loop2:
            for (int b=1;b<strs.length;b++) {
                if (strs[b].length()==a) break Loop1;
            	else if(strs[b].charAt(a)!=strs[0].charAt(a)) {
                    break Loop1;
                }
            }
            prefix+=strs[0].charAt(a);
        }
        return prefix;
    }
}