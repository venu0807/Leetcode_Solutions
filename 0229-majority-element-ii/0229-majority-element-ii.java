class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        int maxCap = nums.length / 3;

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() > maxCap) ans.add(entry.getKey());
        }
        return ans;
    }
}