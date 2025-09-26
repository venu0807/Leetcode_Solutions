class Solution {
    public double findMaxAverage(int[] nums, int k) {
       int sum = 0;
       for(int i = 0;i<k;i++) sum+= nums[i];
       int Maxsum = sum;

       for(int i=k;i<nums.length;i++){
        sum += nums[i] - nums[i-k];
        Maxsum = Math.max(Maxsum,sum);
       }

       return (double) Maxsum / k;
    }
}