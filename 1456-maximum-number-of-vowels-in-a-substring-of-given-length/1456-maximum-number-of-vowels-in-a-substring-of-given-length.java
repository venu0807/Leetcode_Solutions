class Solution {

    private boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public int maxVowels(String s, int k) {
        int[] c = new int[k];
        int max = 0;
        int curr =0;
        for(int i = 0;i<k;i++){
            if(isVowel(s.charAt(i))){
                curr++;
            }
        }
        max = Math.max(max,curr);
        if(max == k) return max;
        for(int i = k;i<s.length();i++){
            if(isVowel(s.charAt(i))) curr++;
            if(isVowel(s.charAt(i-k))) curr--;
            max = Math.max(max,curr);
        }
        return max;
    }
}