class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int right = 0;
        int currentSum = 0;
        int window = Integer.MAX_VALUE;

        while(right < nums.length){
            currentSum += nums[right++];
            while(currentSum >= target) {
                window = Math.min(window, right - left);
                currentSum -= nums[left];
                left++;
            }
        }
        return window == Integer.MAX_VALUE ? 0: window;
    }
}