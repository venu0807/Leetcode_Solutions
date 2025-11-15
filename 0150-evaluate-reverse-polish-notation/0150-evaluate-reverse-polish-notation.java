import java.util.Stack;

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        
        for(int i = 0; i < tokens.length; i++){
            String token = tokens[i];
            
            if(token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")){
                int x = st.pop();
                int y = st.pop();
                int result = 0;
                
                if(token.equals("+")){
                    result = y + x;
                } else if(token.equals("-")){
                    result = y - x;
                } else if(token.equals("*")){
                    result = y * x;
                } else if(token.equals("/")){
                    result = y / x;
                }
                st.push(result);
            } else {
                st.push(Integer.parseInt(token));
            }
        }
        
        return st.pop();
    }
}
