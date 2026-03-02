class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> res = new ArrayList<>();
        for (String word : words) {
            if (isMatch(word, pattern)) {
                res.add(word);
            }
        }
        return res;
    }
    
    private boolean isMatch(String word, String pattern) {
        Map<Character, Character> p2w = new HashMap<>();
        Map<Character, Character> w2p = new HashMap<>();
        for (int i = 0; i < word.length(); ++i) {
            char p = pattern.charAt(i);
            char w = word.charAt(i);
            if (p2w.containsKey(p)) {
                if (p2w.get(p) != w) {
                    return false;
                }
            } else {
                p2w.put(p, w);
            }
            if (w2p.containsKey(w)) {
                if (w2p.get(w) != p) {
                    return false;
                }
            } else {
                w2p.put(w, p);
            }
        }
        return true;
    }
}
