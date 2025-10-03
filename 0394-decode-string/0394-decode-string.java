class Solution {
    public String decodeString(String s) {
        Stack<Integer> numStack = new Stack<>();
        Stack<String> strStack = new Stack<>();
        StringBuilder st = new StringBuilder();
        int len = s.length();

        for(int i=0;i<len;i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                int num = ch - '0';
                while (i+1 < len && Character.isDigit(s.charAt(i+1))){
                    num = num *10 + s.charAt(i+1) - '0';
                    i++;
                }
                numStack.push(num);
            } else if(ch == '['){
                strStack.push(st.toString());
                st = new StringBuilder();
            } else if(ch == ']'){
                int k = numStack.pop();
                StringBuilder tmp = new StringBuilder(strStack.pop());
                for(int j = 0;j<k;j++){
                    tmp.append(st);
                }
                st = tmp;
            } else{
                st.append(ch);
            }
        }
        return st.toString();
    }
}