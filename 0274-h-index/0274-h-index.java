class Solution {
    public int hIndex(int[] citations) {
        int arr[] = new int[1002];
        int max=-1;
        for(int x: citations){
            arr[x]++;
            max=Math.max(max,x);
        }

        for(int i=max; i>=0; i--){
          arr[i] += arr[i+1];
          if(arr[i] >= i)
             return i;
        }
        return 0;
    }
}