class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(k,1,n, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int k, int num, int n,List<Integer> path, List<List<Integer>> result){
        if(n == 0 && k == 0){
            result.add(new ArrayList<>(path));
            return;
        }

        for(int i = num;i<10;i++){
            if(i > n || k <= 0) break;
            path.add(i);
            backtrack(k-1,i+1,n-i,path,result);
            path.remove(path.size() - 1);
        }
    }
}