class Solution {
    public int mostFrequentEven(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();

        for(int num : nums){
            if(num % 2 == 0){
                map.put(num,map.getOrDefault(num,0)+1);
            }
        }

        int max = 0;
        for(int val : map.values()){
            if(val > max) max = val;
        }

        ArrayList<Integer> maxFrq = new ArrayList<>(); 
        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
                if (entry.getValue() == max){
                    maxFrq.add(entry.getKey());
                }     
         }

         if(maxFrq.size() == 0) return -1;
          int ans = maxFrq.get(0);
         for(int i=1;i<maxFrq.size();i++){
            if(maxFrq.get(i) < ans){
                ans = maxFrq.get(i);
            }
         }
         return ans;
    }
}