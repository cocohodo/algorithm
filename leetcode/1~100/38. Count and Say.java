class Solution {
    public String countAndSay(int n) {
        if(n==1) return "1";
        int n2 = 1;
        String answer = "1";
        for(int a = 1; a<n; a++) {
            StringBuilder sb = new StringBuilder();
            char prev = answer.charAt(0);
            int count=1;
            for(int i = 1; i < answer.length(); i++) {
                if(prev==answer.charAt(i)) {
                    count++;
                }
                else {
                    sb.append(count);
                    sb.append(prev);
                    count=1;
                    prev = answer.charAt(i);
                }
            }
            sb.append(count);
            sb.append(prev);
            answer = sb.toString();
        }
        return answer;
    }
}