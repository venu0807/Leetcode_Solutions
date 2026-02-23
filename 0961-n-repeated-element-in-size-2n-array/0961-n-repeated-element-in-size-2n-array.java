class Solution {
    public int repeatedNTimes(int[] nums) {
        int n = 0;        
        Map<Integer,Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                n++;
            }
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() == n){
                return entry.getKey();
            }
        }
        return n;
    }
}