class Solution {
    public boolean hasAlternatingBits(int n) {
        String s = "";
        if(n == 0){
            s += "0";
        } else{
            while(n > 0){
                int rem = n % 2;
                s += rem;
                n /= 2;
            }
        }

        for(int i=0;i<s.length()-1;i++){
            if((s.charAt(i) == '1' && s.charAt(i+1) == '1') || (s.charAt(i) == '0' && s.charAt(i+1) == '0')){
                return false;
            }
        }
        return true;
    }
}