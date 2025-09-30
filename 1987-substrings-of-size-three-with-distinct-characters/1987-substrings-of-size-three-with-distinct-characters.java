class Solution {
    public int countGoodSubstrings(String s) {

         if (s.length() < 3) return 0;

        int r = 2;

        char c1 = s.charAt(0);
        char c2 = s.charAt(1);
        char c3 = s.charAt(2);

        int count = 0;

        while (r < s.length()) {
            if (c1 != c2 && c2 != c3 && c1 != c3) count++;

            c1 = c2;
            c2 = c3;
            r++;
            if (r < s.length()) c3 = s.charAt(r);
        }

        return count;



        // int value = 0;

        // for(int i = 0;i<s.length() -2;i++){
        //     char a = s.charAt(i);
        //     char b = s.charAt(i+1);
        //     char c = s.charAt(i+2);
        //     if(a != b && b != c && c != a) value++;
        // }
        // return value;
    }
}