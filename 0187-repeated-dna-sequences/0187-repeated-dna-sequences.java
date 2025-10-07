class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> set = new HashSet<>();
        Set<String> list = new HashSet<>();

        for(int i=0;i<=s.length() - 10;i++){
            String ss = s.substring(i,i+10);
            if(set.contains(ss)){
                list.add(ss);
            } else{
                set.add(ss);
            }
        }
        return new ArrayList(list);
    }
}