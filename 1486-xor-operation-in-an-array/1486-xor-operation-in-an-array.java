class Solution {
    public int xorOperation(int n, int start) {
        int ans = 0;
        int res = start;
        for(int i=1;i<n;i++){
            ans= start + (2 * i);
            res = ans ^ res;
        }
        return res;
    }
}