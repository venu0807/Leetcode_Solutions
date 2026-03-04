class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> Long.compare((long) nums1[a[0]] + nums2[a[1]], 
                                   (long) nums1[b[0]] + nums2[b[1]])
        );
        int rows = Math.min(k, nums1.length);
        for (int i = 0; i < rows; ++i) {
            pq.offer(new int[]{i, 0});
        }
        while (ans.size() < k && !pq.isEmpty()) {
            int[] idx = pq.poll();
            ans.add(Arrays.asList(nums1[idx[0]], nums2[idx[1]]));
            if (idx[1] + 1 < nums2.length) {
                pq.offer(new int[]{idx[0], idx[1] + 1});
            }
        }
        return ans;
    }
}
