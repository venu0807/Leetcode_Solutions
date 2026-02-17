class Solution {
    public String interpret(String command) {
        char[] chars = command.toCharArray();
        int len = chars.length;
        StringBuilder sb = new StringBuilder(len);
        for (int i = 0; i < len; i++) {
            if (chars[i] == 'G') {
                sb.append('G');
            } else {
                if (chars[++i] == ')') {
                    sb.append('o');
                } else {
                    sb.append("al");
                    i += 2;
                }
            }
        }
        return sb.toString();
    }
}