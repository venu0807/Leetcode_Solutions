// class Solution {
//     public int longestConsecutive(int[] nums) {
//         HashMap<Integer, Boolean> map = new HashMap<>();
//         int max = 0;
//         for(int num : nums){
//             map.put(num, Boolean.FALSE); 
//         }

//         for(int num : nums){
//             int current = 1;
//             map.put(num, Boolean.TRUE);

//             int next = num + 1;
//             while(map.containsKey(next) && map.get(next) == false){
//                 current++;
//                 map.put(next, Boolean.TRUE);
//                 next++;
//             }

//             int prev = num - 1;
//             while(map.containsKey(prev) && map.get(prev) == false){
//                 current++;
//                 map.put(prev,Boolean.FALSE);
//                 prev--;
//             }
//             max = Math.max(max,current);
//         }
//         return max;
//     }
// }


import java.util.HashSet;

class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int max = 0;

        for (int num : set) {
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                max = Math.max(max, currentStreak);
            }
        }

        return max;
    }
}
