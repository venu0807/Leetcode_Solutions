class Solution {
    public int numberOfBeams(String[] bank) {
        
        int m = bank.length;
        int n = bank[0].length();

        int[] arr = new int[m];
        int sum =0;

        for(int row = 0; row<m;row++){
            int count = 0;
            for(int col =0;col<n;col++){
                if(bank[row].charAt(col) == '1'){
                    count++;
                }
            }
            arr[row] = count;
        }

        int left = 0;

        for(int right = 1; right<arr.length;right++){
            if(arr[left] != 0 && arr[right] != 0){
                sum += arr[left] * arr[right];
                left = right;
            } else if(arr[left] == 0 && arr[right] == 0){
                left = right + 1;
                right++;
            } else if(arr[left] == 0 && arr[right] != 0){
                left = right;
            }
        }

        return sum;
    }
}