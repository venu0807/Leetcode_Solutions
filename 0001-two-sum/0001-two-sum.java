public class Solution {
    public int[] twoSum(int[] nums, int target) {
       Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement), i};
            }
            numMap.put(nums[i], i);
        }
        return new int[]{};
    }
}

//  HashMap<Integer, Integer> map = new HashMap<>();
//         int[] indices = new int[2];
//         for (int i=0;i<nums.length;i++) {
//             int complement = target - nums[i];
//             if (!map.containsKey(complement)) {
//                 map.put(nums[i],i);
//             } else {
//                 indices[0] = map.get(complement);
//                 indices[1] = i;
//                 break;
//             }
//         }
//         return indices;