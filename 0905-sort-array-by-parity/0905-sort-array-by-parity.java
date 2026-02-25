class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        
        int left = 0;

        for(int right = 0;right<n;right++){
            if(nums[right] % 2 == 0){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
            }
        }
        return nums;
    }
}