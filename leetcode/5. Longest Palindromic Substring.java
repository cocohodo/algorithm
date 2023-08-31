class Solution {
    public String longestPalindrome(String s) {
        int max=0,max1=0,max2=0;
        if(s.length()==1) return s;
        else if (s.length()==2) {
        	if (s.charAt(0)==s.charAt(1)) return s;
        	return s.substring(0,1);
        }
        for(int a=0,b=s.length();a<s.length()-1;a++) {
        	if (b-a-1<=max) continue;
        	loop1 :
        	for (int d=1;b-d>a;d++) {
        		if (max>b-d-a) break;
        		if (s.charAt(a)==s.charAt(b-d)) {
        			for(int c=1;c<1000;c++) {
        				if (s.charAt(a+c)!=s.charAt(b-d-c)) {
        					break;
        				}
        				else if(b-c-d-a<=1&&b-d-a+1>max) {
        					max = b-d-a+1;
        					max1 = a;
        					max2 = b-d;
        					break loop1;
        				}
        			}
        			
        		}
        	}
        }
        return s.substring(max1,max2+1);
    }
}