class Solution {
    public String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0")) return "0";
        int len1 = num1.length();
        int len2 = num2.length();
        int[] sum = new int[len1+len2];
        for(int i = len2 - 1; i >= 0; i--) {
            for(int j = len1 - 1; j >= 0; j--) {
                sum[i+j+1] += (num2.charAt(i) - '0') * (num1.charAt(j) - '0');
                sum[i+j] += sum[i+j+1] / 10;
                sum[i+j+1] = sum[i+j+1] % 10;
            }
        }
        StringBuilder sb = new StringBuilder();
        if(sum[0]!=0) sb.append(sum[0]);
        for(int i = 1; i < len1+len2; i++) {
            sb.append(sum[i]);
        }
        return sb.toString();
    }
}