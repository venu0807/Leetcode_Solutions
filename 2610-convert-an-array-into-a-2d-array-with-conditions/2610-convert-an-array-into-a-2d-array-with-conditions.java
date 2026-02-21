class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        while (!countMap.isEmpty()) {
            List<Integer> temp = new ArrayList<>();
            List<Integer> currentKeys = new ArrayList<>(countMap.keySet());
            for (int key : currentKeys) {
                temp.add(key);
                int newCount = countMap.get(key) - 1;
                if (newCount == 0) {
                    countMap.remove(key);
                } else {
                    countMap.put(key, newCount);
                }
            }
            ans.add(temp);
        }
        return ans;
    }
}
