class Solution {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder clean = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c != '-') {
                clean.append(Character.toUpperCase(c));
            }
        }
        int n = clean.length();
        if (n == 0) return "";
        StringBuilder res = new StringBuilder();
        int firstLen = n % k;
        if (firstLen == 0) firstLen = k;
        for (int i = 0; i < firstLen; ++i) {
            res.append(clean.charAt(i));
        }
        int pos = firstLen;
        while (pos < n) {
            res.append('-');
            for (int j = 0; j < k && pos < n; ++j, ++pos) {
                res.append(clean.charAt(pos));
            }
        }
        return res.toString();
    }
}
