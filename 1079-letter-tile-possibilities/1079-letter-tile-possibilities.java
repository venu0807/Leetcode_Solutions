class Solution {
    public int numTilePossibilities(String tiles) {
        int[] count = new int[26];
        for (char c : tiles.toCharArray()) {
            count[c - 'A']++;
        }
        return dfs(count);
    }
    
    private int dfs(int[] count) {
        int res = 0;
        for (int i = 0; i < 26; i++) {
            if (count[i] > 0) {
                count[i]--;
                res += 1 + dfs(count);
                count[i]++;
            }
        }
        return res;
    }
}
