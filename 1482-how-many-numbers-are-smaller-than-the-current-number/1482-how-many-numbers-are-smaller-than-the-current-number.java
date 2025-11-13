class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        // Frequency array for range 0 to 100
        int[] frequency = new int[101];
        
        // Count the frequency of each number in nums
        for (int num : nums) {
            frequency[num]++;
        }
        
        // Calculate cumulative frequency to find out how many numbers are
        // less than the current number
        for (int i = 1; i < 101; i++) {
            frequency[i] += frequency[i - 1];
        }
        
        // Prepare the result array using the cumulative frequency
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            // If the number is greater than 0, get count from frequency array
            // which means count of numbers smaller than nums[i]
            result[i] = nums[i] > 0 ? frequency[nums[i] - 1] : 0;
        }
        
        return result;
    }
}
