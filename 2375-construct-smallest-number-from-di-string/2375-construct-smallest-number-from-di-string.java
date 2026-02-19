class Solution {
    public String smallestNumber(String pattern) {
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        int len = pattern.length();
        for (int i = 0; i <= len; i++) {
            stack.push(i + 1);
            if (i == len || pattern.charAt(i) == 'I') {
                while (!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
            }
        }
        return sb.toString();
    }
}
