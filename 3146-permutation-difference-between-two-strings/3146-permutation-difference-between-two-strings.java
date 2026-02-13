class Solution {
    public int findPermutationDifference(String s, String t) {
        HashMap<Character, Integer> smap = new HashMap<>();
        HashMap<Character, Integer> tmap = new HashMap<>();

        int ans =0;
        for(int i=0;i<s.length();i++){
            smap.put(s.charAt(i),i);
        }
        for(int i=0;i<t.length();i++){
            tmap.put(t.charAt(i),i);
        }

        for(int i=0;i<t.length();i++){
            ans += Math.abs(smap.get(s.charAt(i)) - tmap.get(s.charAt(i)));
        }
        return ans;
    }
}