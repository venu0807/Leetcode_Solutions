public class Solution {
    public int binaryGap(int n) {
        int maxGap = 0;
        int lastPos = -1;
        int pos = 0;
        while (n > 0) {
            if ((n & 1) == 1) {
                if (lastPos != -1) {
                    maxGap = Math.max(maxGap, pos - lastPos);
                }
                lastPos = pos;
            }
            n >>= 1;
            pos++;
        }
        return maxGap;
    }
}
