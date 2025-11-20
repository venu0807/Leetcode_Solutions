class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] answer = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            // Pop elements from the stack until the stack is empty
            // or the current temperature is less than the stack's top element
            while (!stack.isEmpty() && temperatures[stack.peek()] <= temperatures[i]) {
                stack.pop();
            }
            
            // If the stack is not empty, the top element has a greater temperature
            if (!stack.isEmpty()) {
                answer[i] = stack.peek() - i;
            }
            
            // Push current day's index onto the stack
            stack.push(i);
        }

        return answer;
    }
}
