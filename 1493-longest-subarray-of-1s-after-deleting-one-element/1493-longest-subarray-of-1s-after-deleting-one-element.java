class Solution {
    public int longestSubarray(int[] nums) {
        int maxLen = 0;
        int left = 0;
        int zerosCount = 0;
        for(int right = 0; right<nums.length;right++){
            if(nums[right] == 0){
                zerosCount++;
            }
            while(zerosCount > 1){
                if(nums[left] == 0){
                    zerosCount--;
                }
                left++;
            }
            maxLen = Math.max(maxLen, right - left);
        }
        return maxLen;
    }
}