class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n = nums.length;
        Set<Integer> elements = new HashSet<>();
        long currentSum = 0;
        long maxSum = 0;
        int begin = 0;
        
        for (int end = 0; end < n; end++) {
            if (!elements.contains(nums[end])) {
                currentSum += nums[end];
                elements.add(nums[end]);
                
                if (end - begin + 1 == k) {
                    maxSum = Math.max(maxSum, currentSum);
                    currentSum -= nums[begin];
                    elements.remove(nums[begin]);
                    begin++;
                }
            } else {
                while (nums[begin] != nums[end]) {
                    currentSum -= nums[begin];
                    elements.remove(nums[begin]);
                    begin++;
                }
                begin++;
            }
        }
        
        return maxSum;
    }
}


// class Solution {
//     public long maximumSubarraySum(int[] nums, int k) {
//         long max = 0, sum = 0;
//         int l = 0;

//         HashMap<Integer, Integer> freq = new HashMap<>();

//         for(int r=0;r<nums.length;r++){
//             sum += nums[r];
//             freq.put(nums[r], freq.getOrDefault(nums[r], 0) +1);

//             if(r - l + 1 == k){
//                 if(freq.size() == k){
//                     max = Math.max(max,sum);
//                 }
//                 sum -= nums[l];
//                 freq.put(nums[l], freq.get(nums[l]) - 1);
//                 if(freq.get(nums[l]) == 0) freq.remove(nums[l]);
//                 l++;
//             }
//         }
//         return max;
//     }
// }