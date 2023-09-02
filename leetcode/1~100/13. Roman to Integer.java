import java.util.*;
class Solution {
    public int romanToInt(String s) {
        int result=0,prev=0,value=0;
        s.replaceAll("\"","");
        for (int a = s.length()-1; a >= 0; a--) {
            switch(s.charAt(a)) {
                case 'M' : value = 1000; break;
                case 'D' : value = 500; break;
                case 'C' : value = 100; break;
                case 'L' : value = 50; break;
                case 'X' : value = 10; break;
                case 'V' : value = 5; break;
                case 'I' : value = 1; break;
            }
            if (value<prev) {
                result-=value;
            }
            else result+=value;
            prev=value;
        }
        return result;
    }
}