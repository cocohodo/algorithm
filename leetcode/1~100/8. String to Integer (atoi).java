class Solution {
    public int myAtoi(String s) {
        long answer = 0;
        int count = 0;
        boolean start = false;
        boolean zero = false;
        boolean pm = false;
        boolean negative=false;
        for(int a=0;a<s.length();a++) {
            if(s.substring(a,a+1).equals(" ")) {
                if(start||zero||pm) break;
                continue;
            }
            else if (s.substring(a,a+1).equals("-")) {
                if(start||zero||pm) {break;}
                negative = true;
                pm = true;
            }
            else if (s.substring(a,a+1).equals("+")) {
                if(start||zero||pm) {break;}
                pm = true;
            }
            else if (s.charAt(a)<48 || s.charAt(a)>57) {
                if(start||zero||pm) {break;}
                else {answer=0;break; }
            }
            else if (Integer.valueOf(s.substring(a,a+1))<=9&&Integer.valueOf(s.substring(a,a+1))>=0) {
                if(!start&&Integer.valueOf(s.substring(a,a+1))==0) {zero=true; continue;}
                else if(!start) {start=true; zero=false;}
                if(!zero&&start) count++;
                answer*=10;
                answer+=Integer.valueOf(s.substring(a,a+1));
            }
        }
        if(answer>2147483647||count>10) {
            answer = 2147483647;
            if(negative) answer++;
        }

        if(negative) return -1*(int)answer;
        return (int)answer;
    }
}