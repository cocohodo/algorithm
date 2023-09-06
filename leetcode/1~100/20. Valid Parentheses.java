//char배열로 바꾸면 시간 줄일 수 있음
class Solution {
    public boolean isValid(String s) {
        Stack<Character> check = new Stack<Character>();
        for(int i = 0; i<s.length();i++) {
            switch(s.charAt(i)) {
                case('(') : check.push('('); break;
                case(')') : if(check.empty()||check.pop()!='(') {return false;} break;
                case('{') : check.push('{'); break;
                case('}') : if(check.empty()||check.pop()!='{') {return false;} break;
                case('[') : check.push('['); break;
                case(']') : if(check.empty()||check.pop()!='[') {return false;} break;
            }
        }
        if(check.empty()) return true;
        return false;
    }
}