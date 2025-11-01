class Solution {
    public String reversePrefix(String word, char ch) {

        for(int i = 0;i<word.length();i++){
            char c = word.charAt(i);
            if(c == ch){
                return reverse(word,0, i);
            }
        }
        return word;
    }

    public String reverse(String word, int left, int right){
        char[] chars = word.toCharArray();
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return new String(chars);
    }
}