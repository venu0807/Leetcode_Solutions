class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return countLessThanEqualToK(nums, k) - countLessThanEqualToK(nums, k - 1);
    }
    
    private int countLessThanEqualToK(int[] nums, int k) {
        if (k < 0) return 0;
        int left = 0, oddCount = 0, count = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] % 2 == 1) oddCount++;
            while (oddCount > k) {
                if (nums[left] % 2 == 1) oddCount--;
                left++;
            }
            count += right - left + 1;
        }
        return count;
    }
}
