class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int ans = 0;
        int tk = tickets[k];
        int n = tickets.length;
        for (int i = 0; i < n; i++) {
            if (i <= k) {
                ans += Math.min(tickets[i], tk);
            } else {
                ans += Math.min(tickets[i], tk - 1);
            }
        }
        return ans;
    }
}
