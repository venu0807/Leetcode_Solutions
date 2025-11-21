import java.util.Stack;

class Solution {
    public int largestRectangleArea(int[] heights) {
        if (heights == null || heights.length == 0) {
            return 0;
        }

        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int index = 0;

        while (index < heights.length) {
            // If this bar is higher than the bar at stack top, push it to the stack.
            if (stack.isEmpty() || heights[index] >= heights[stack.peek()]) {
                stack.push(index++);
            } else {
                // Pop the top
                int top = stack.pop();
                // Calculate the area with heights[top] as the smallest (or minimum height) bar 'h'
                int height = heights[top];
                int width = (stack.isEmpty()) ? index : index - stack.peek() - 1;
                maxArea = Math.max(maxArea, height * width);
            }
        }

        // Now pop the remaining bars from stack and calculate area with each popped bar as the smallest bar
        while (!stack.isEmpty()) {
            int top = stack.pop();
            int height = heights[top];
            int width = (stack.isEmpty()) ? index : index - stack.peek() - 1;
            maxArea = Math.max(maxArea, height * width);
        }

        return maxArea;
    }
}
