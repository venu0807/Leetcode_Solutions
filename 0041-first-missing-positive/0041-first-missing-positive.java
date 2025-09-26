class Solution {
    public int firstMissingPositive(int[] nums) {
        int value = 0;
        HashMap<Integer,Boolean> map = new HashMap<>();

        for(int i : nums){
            if(i > 0){
                map.put(i, true);
            }
        }

        for(int i = 1; i<=nums.length;i++){
            if(!map.containsKey(i)) return i;
        }
        return nums.length +1 ;
    }
}