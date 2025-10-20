class Solution {
    public boolean canPartition(int[] nums) {
        int total = Arrays.stream(nums).sum();
        if(total % 2 == 1) return false;
        int target = total / 2;

        boolean[] dp = new boolean[target + 1];
        dp[0] = true;
        for(int i = 0;i<nums.length;i++){
            for(int curr = dp.length -1;curr>=1;curr--){
                if(curr >= nums[i]){
                    dp[curr] = dp[curr] || dp[curr - nums[i]];
                }
            }
        } 
        return dp[target] == true ? true : false;      
    }
}