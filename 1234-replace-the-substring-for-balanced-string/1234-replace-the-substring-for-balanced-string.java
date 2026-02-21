class Solution {
    public int balancedString(String s) {
        int[] freq = new int[26];
        for(char c : s.toCharArray()){
            freq[c - 'A']++;
        }
        int n = s.length();
        int res = n;
        int k = n / 4;
        int left = 0;
        for(int right = 0; right < n; right++){
            freq[s.charAt(right) - 'A']--;
            while(left < n && freq['Q' - 'A'] <= k && freq['W' - 'A'] <= k && freq['E' - 'A'] <= k && freq['R' - 'A'] <= k){
                res = Math.min(res, right - left + 1);
                freq[s.charAt(left) - 'A']++;
                left++;
            }
        }
        return res;
    }
}