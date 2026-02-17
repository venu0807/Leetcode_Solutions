class Solution {
    public int reverseDegree(String s) {
        // int[] hash = new int[26];
        int ans = 0;
        for(int i=1;i<=s.length();i++){
            ans += i * (122 - (int)s.charAt(i-1) + 1);
        }
        return ans;
    }
}