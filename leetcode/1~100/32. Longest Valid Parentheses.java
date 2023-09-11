class Solution {
    public int longestValidParentheses(String s) {
        if(s.length()==0||s.length()==1) return 0;
        Stack<Integer> st = new Stack<>();
        int max = 0;
        st.push(-1);

        for (int i=0;i<s.length();i++) {
            if(s.charAt(i)=='(') st.push(i);
            else {
                st.pop();
                if(st.empty()) st.push(i);
                else max = Math.max(max,i-st.peek());
            }
        }
        return max;
    }
}