class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) set.add(n);
        int i = 1;
        while (true) {
            if (i % k == 0 && !set.contains(i)) return i;
            i++;
        }
    }
}