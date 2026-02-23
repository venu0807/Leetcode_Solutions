class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String, Integer> map = new HashMap<>();

        for(String str : s1.split(" ")) {
            map.put(str, map.getOrDefault(str, 0) + 1);
        }

        for(String str : s2.split(" ")) {
            map.put(str, map.getOrDefault(str, 0) + 1);
        }

        int count = 0;
        for (String key : map.keySet()) {
            if(map.get(key) == 1) count++;
        }

        String result[] = new String[count];

        int ind = 0;
        for (String key : map.keySet()) {
            if(map.get(key) == 1) result[ind++] = key;
        }

        return result;
    }
}