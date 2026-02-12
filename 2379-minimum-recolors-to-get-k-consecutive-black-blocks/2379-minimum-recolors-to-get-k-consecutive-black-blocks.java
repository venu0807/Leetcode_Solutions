class Solution {
    public int minimumRecolors(String blocks, int k) {
        
        int left = 0;
        int right = 0;
        int ans = k;
        int count = 0;

        while(right < blocks.length()){
            if(blocks.charAt(right) == 'W'){
                count++;
            }

            if(right - left +1 == k){
                ans = Math.min(ans, count);
                if(blocks.charAt(left) == 'W'){
                    count--;
                }
                left++;
            }
            right++;
        }
        return ans;
    }
}