class Solution {
    public int mostWordsFound(String[] sentences) {
        int max =0;
        for(String sen : sentences) {
            int spaceCount = 0;
            for(char ch : sen.toCharArray()) {
                if(ch == ' ') spaceCount++;
            }
            max = Math.max(max,spaceCount + 1);
        }
        return max;
    }
}