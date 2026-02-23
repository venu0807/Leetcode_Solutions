class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();

        for(int num: nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int maxCap = nums.length / 2;
        int ans = 0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() > maxCap) ans = entry.getKey();
        }
        return ans;
    }
}