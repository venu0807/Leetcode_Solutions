class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> res = new ArrayList<>();
        Map<Integer, List<Integer>> groups = new HashMap<>();
        for (int i = 0; i < groupSizes.length; i++) {
            int size = groupSizes[i];
            List<Integer> list = groups.computeIfAbsent(size, k -> new ArrayList<>());
            list.add(i);
            if (list.size() == size) {
                res.add(list);
                groups.put(size, new ArrayList<>());
            }
        }
        return res;
    }
}
