class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        listOfelements(nums,result,new ArrayList<>());
        return result;
    }

    private void listOfelements(int[] nums, List<List<Integer>> result, List<Integer> perm){
       if(perm.size() == nums.length){
        result.add(new ArrayList<>(perm));
       }

       for(int i = 0;i<nums.length;i++){
        if(perm.contains(nums[i])) continue;
        perm.add(nums[i]);
        listOfelements(nums,result,perm);
        perm.remove(perm.size() - 1);
       }
    }
}