class Solution {
    public int numSubarrayBoundedMax(int[] nums, int left, int right) {
       int ind = 0;
       int start = 0, end = 0, count = 0;
       while(end < nums.length){
        if(nums[end] > right){
            end = end+1;
            start = end;
            ind = end;
        }else{
            if(nums[end] >= left){
                ind = end;
            }
            if(nums[ind] >= left)
            count += ind-start+1;
            end++;
        }
       }
       return count; 
    }
}