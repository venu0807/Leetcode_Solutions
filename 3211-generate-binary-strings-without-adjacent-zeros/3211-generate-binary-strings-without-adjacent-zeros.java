class Solution {
    public List<String> validStrings(int n) {
        List<String> result = new ArrayList<>();
        backtrack(n,-1, new StringBuilder(), result);
        return result;
    }

    private void backtrack(int n, int last, StringBuilder sb, List<String> result){
        if(sb.length() == n){
            result.add(sb.toString());
            return;
        }

        sb.append('1');
        backtrack(n,1,sb,result);
        sb.deleteCharAt(sb.length() - 1);

        if(last != 0){
            sb.append('0');
            backtrack(n,0,sb,result);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}