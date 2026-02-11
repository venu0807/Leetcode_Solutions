class Solution {
    public int characterReplacement(String s, int k) {

        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0;
        int max = 0;
        int ans = 0;

        for(int right =0;right<s.length();right++){
            char c = s.charAt(right);
            map.put(c,map.getOrDefault(c,0)+1);
            max = Math.max(max,map.get(c));

            while((right - left + 1) - max > k){
                char c2 = s.charAt(left);
                map.put(c2,map.get(c2) - 1);
                left++;
            }
            ans = Math.max(ans, right - left + 1);
        }

        return ans;
    }
}