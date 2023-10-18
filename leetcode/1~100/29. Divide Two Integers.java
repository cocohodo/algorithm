class Solution {
    public int divide(int dividend, int divisor) {
        int answer = 0;
        int binary = 1;
    	  boolean negative = false;
        if(divisor==Integer.MIN_VALUE) return dividend == Integer.MIN_VALUE ? 1:0;
        if(divisor==1) return dividend;
        if(dividend==Integer.MIN_VALUE) {
            if(divisor==-1) return Integer.MAX_VALUE;
            answer++;
            dividend+=Math.abs(divisor);
        }
        if((dividend < 0) != (divisor < 0)) {
    		  negative = true;
    	  }

        int a = Math.abs(dividend);
        int b = Math.abs(divisor);
        while(a>0) {
          if(a>=b) {
            a-=b;
            answer+=binary;
            if(b>30) continue;
            b<<=1;
            binary<<=1;
          }
          else {
            if(a<divisor) break;
            b>>=1;
            binary>>=1;
          }
        }
        return negative ? -answer:answer;
    }
}