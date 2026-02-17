class Solution {
    public int balancedStringSplit(String s) {
        int balance = 0, ans = 0;
        for (char c : s.toCharArray()) {
            balance += (c == 'R') ? 1 : -1;
            if (balance == 0) ans++;
        }
        return ans;
    }
}
