class Solution {
    public long solution(int a, int b, int[] g, int[] s, int[] w, int[] t) {
        long answer = 400000000000000L;
        long low = 0;
        long high = 400000000000000L;
        long gold;
        long silver;
        long sum;
        long mid;
        while(low<=high){
            mid = (low+high) / 2;
            gold = 0;
            silver = 0;
            sum = 0;
            for(int i = 0; i < w.length; i++) {
                long moveCount = mid / (t[i]*2L);
                if (mid % (t[i]*2L) >= t[i]) moveCount++;
                gold += Math.min(g[i],moveCount*w[i]);
                silver += Math.min(s[i],moveCount*w[i]);
                sum += Math.min(g[i]+s[i],moveCount*w[i]);
            }
            if (gold>=a && silver>=b && sum>=a+b) {
                high = mid - 1;
                answer = Math.min(answer,mid);
            }
            else {
                low = mid + 1;
            }
        }
        return answer;
    }
}