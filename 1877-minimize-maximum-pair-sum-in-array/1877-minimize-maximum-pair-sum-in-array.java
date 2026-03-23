class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int res = 0;

        int left =0;
        int right = nums.length - 1;

        while(left < right){
            res = Math.max(res, nums[left] + nums[right]);
            left++;
            right--;
        }
        return res;
    }
}