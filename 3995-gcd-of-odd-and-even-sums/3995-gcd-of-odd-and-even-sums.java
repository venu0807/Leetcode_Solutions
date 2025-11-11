class Solution {
    public int gcdOfOddEvenSums(int n) {
        int oddValue = 0;
        int evenValue = 0;

        for(int i=1;i<=n*2;i++){
            if(i % 2 == 0){
                evenValue += i;
            } else{
                oddValue += i;
            }
        }
        return gcd(oddValue, evenValue);
    }

    private int gcd(int a, int b){
        return b==0 ? a : gcd(b, a%b);
    }
}