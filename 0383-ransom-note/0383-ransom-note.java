class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        //count array
        int[] count = new int[26];
        for( char c : ransomNote.toCharArray()){
            //get index of this char in magazine
            int i = magazine.indexOf(c,count[c-'a']);
            if(i == -1){
                return false;
            }
            count[c-'a'] = i+1 ;
        }
        return true;
    }
}




// class Solution {
//     public boolean canConstruct(String ransomNote, String magazine) {
//         HashMap<Character, Integer> mapm = new HashMap<>();

//         for (char c : magazine.toCharArray()) {
//             mapm.put(c, mapm.getOrDefault(c, 0) + 1);
//         }

//         for (char c : ransomNote.toCharArray()) {
//             if (!mapm.containsKey(c) || mapm.get(c) == 0) {
//                 return false;
//             }
//             mapm.put(c, mapm.get(c) - 1);
//         }

//         return true;
//     }
// }
