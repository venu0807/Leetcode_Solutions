class Solution {
    public char findTheDifference(String s, String t) {
        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();

        char result = 0;

        for (char c : str1) {
            result ^= c;
        }

        for (char f : str2) {
            result ^= f;
        }
        return result;
    }
}