class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> mapm = new HashMap<>();

        for (char c : magazine.toCharArray()) {
            mapm.put(c, mapm.getOrDefault(c, 0) + 1);
        }
        
        for (char c : ransomNote.toCharArray()) {
            if (!mapm.containsKey(c) || mapm.get(c) == 0) {
                return false;
            }
            mapm.put(c, mapm.get(c) - 1);
        }

        return true;
    }
}
