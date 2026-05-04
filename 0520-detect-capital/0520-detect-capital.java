class Solution {
    public boolean detectCapitalUse(String word) {
        int n = word.length();
        int capCount = 0;
        for (char c : word.toCharArray()) {
            if (Character.isUpperCase(c)) capCount++;
        }
        if (capCount == 0 || capCount == n) return true;
        return capCount == 1 && Character.isUpperCase(word.charAt(0));
    }
}
