class Solution {
    public int maxLength(List<String> arr) {
        return dfs(arr,"",0);
    }
    public int dfs(List<String> arr, String str, int curr){
        if(curr == arr.size()){
            return str.length();
        }

        int left=0,right=0;
        String tmp = str + arr.get(curr);
        if(isUnique(tmp)){
            left = dfs(arr,tmp,curr + 1);
        }
        right = dfs(arr,str,curr+1);
        return Math.max(left,right);
    }

    public boolean isUnique(String s){
        int[] arr = new int[26];

        for(int i=0;i<s.length();i++){
            arr[s.charAt(i) - 'a']++;
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i] > 1) return false;
        }
        return true;
    }
}