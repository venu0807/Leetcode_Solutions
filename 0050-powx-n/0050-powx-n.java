class Solution {
    public double myPow(double x, int n) {
        long num = Math.abs((long) n);
        double result = 1.0;

        while(num !=0){
            if(num %2 == 1){
                result = result * x;
                num = num -1;
            }
            x = x*x;
            num = num / 2;
        }
        return  n < 0 ? 1.0/result : result;
    }
}