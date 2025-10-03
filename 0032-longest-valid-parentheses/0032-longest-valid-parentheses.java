class Solution {
    public int longestValidParentheses(String s) {
        int ans = 0;
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '('){
                st.push(i);
            } else{
                st.pop();
                if(st.size() == 0){
                    st.push(i);
                } else{
                    ans = Math.max(ans, i - st.peek());
                }
            }
        }
        return ans;
    }
}