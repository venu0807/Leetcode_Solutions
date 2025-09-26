// class Solution {
//     public int firstMissingPositive(int[] nums) {
//         int value = 0;
//         HashMap<Integer,Boolean> map = new HashMap<>();

//         for(int i : nums){
//             if(i > 0){
//                 map.put(i, true);
//             }
//         }

//         for(int i = 1; i<=nums.length;i++){
//             if(!map.containsKey(i)) return i;
//         }
//         return nums.length +1 ;
//     }
// }


class Solution {
    public int firstMissingPositive(int[] nums) {

        int len = nums.length;

        for(int i =0 ; i<len; i++) {
            if (nums[i] <=0 ) {
                nums[i] = len + 1;
            }
        }

        for (int i = 0; i<len; i++) {
            int value = Math.abs(nums[i]);
            if (value <= len) {
                nums[value-1] = -Math.abs(nums[value-1]);
            }
        }

        for (int i = 0; i < len; i++) {
            if (nums[i] > 0) {
                return i + 1;
            }
        }

        return len + 1;
    }


}