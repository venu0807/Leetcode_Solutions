class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder s = new StringBuilder(); 
        int n = word1.length(); 
        int m = word2.length();
        int length = Math.max(n, m);

        for (int i = 0; i < length; i++) {
            if (i < n) {
                s.append(word1.charAt(i));
            }
            if (i < m) {
                s.append(word2.charAt(i));
            }
        }
        return s.toString();
    }
}
