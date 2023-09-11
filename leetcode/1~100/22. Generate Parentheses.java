class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> answer = new ArrayList<>();
        StringBuilder builder = new StringBuilder();
        builder.append("(");
        parenthesis(n*2,1,answer,builder);
        return answer;
    }
    public void parenthesis(int n,int count,List<String> answer,StringBuilder builder) {
        if(n==builder.length()) {
            answer.add(builder.toString());
            return;
        }
        if(n-builder.length()>count) {
            builder.append("(");
            parenthesis(n,count+1,answer,builder);
            builder.deleteCharAt(builder.length()-1);
        }
        if(count>0) {
            builder.append(")");
            parenthesis(n,count-1,answer,builder);
            builder.deleteCharAt(builder.length()-1);
        }
        
    }
}