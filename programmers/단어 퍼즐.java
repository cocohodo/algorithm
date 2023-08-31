import java.util.Arrays;
class Solution {
    public int solution(String[] strs, String t) {
        int[] dp = new int[t.length()];
        Arrays.fill(dp,20001);
        for(int i = 0; i<t.length();i++) {
            String current = t.substring(0,i+1);
            for (String str : strs) {
                if (current.endsWith(str)) {
                    if(str.equals(current)) {
                        dp[i] = 1;
                    }
                    else dp[i] = Math.min(dp[i], dp[current.length()-str.length()-1] + 1);
                }
            }
        }
        if (dp[t.length()-1]==20001) return -1;
        return dp[t.length()-1];
        
    }
}