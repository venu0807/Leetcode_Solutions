class Solution {
    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
        int[] freq = new int[51];
        for (int x : nums1) {
            freq[x]++;
        }
        int ans = 0;
        for (int y : nums2) {
            long d = (long) y * k;
            if (d > 50) continue;
            for (long mul = d; mul <= 50; mul += d) {
                ans += freq[(int) mul];
            }
        }
        return ans;
    }
}
