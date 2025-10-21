class Solution {
    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];
        for(int[] row : dp){
            Arrays.fill(row, -1);
        }
        return dfs(s,0,n-1,dp);
    }

    public static int dfs(String s, int start, int end, int[][] dp){
        if(start == end) return 1;
        if(start > end) return 0;
        if(dp[start][end] != -1) return dp[start][end];

        if(s.charAt(start) == s.charAt(end)){
            return 2 +  dfs(s, start + 1, end -1, dp);
        }
        int left = dfs(s, start + 1, end, dp);
        int right = dfs(s, start, end-1, dp);

        return dp[start][end] = Math.max(left,right);
    }
}