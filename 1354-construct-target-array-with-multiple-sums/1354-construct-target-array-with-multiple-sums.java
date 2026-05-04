import java.util.*;

class Solution {
    public boolean isPossible(int[] target) {
        int n = target.length;
        long total = 0;
        PriorityQueue<Long> pq = new PriorityQueue<>((a, b) -> Long.compare(b, a));
        for (int x : target) {
            total += x;
            pq.offer((long) x);
        }
        while (!pq.isEmpty() && pq.peek() > 1) {
            long m = pq.poll();
            long rest = total - m;
            if (rest == 0 || m - rest < 1) {
                return false;
            }
            long p = m % rest;
            if (p == 0) p = rest;
            total = total - m + p;
            pq.offer(p);
        }
        return true;
    }
}
