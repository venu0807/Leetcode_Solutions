class Solution {
    public int minPartitions(String n) {
        int max = (int)n.charAt(0)-48;

        for(int i=1;i<n.length();i++){
            max = Math.max(max, (int)n.charAt(i)-48);
        }
        return max;
    }
}