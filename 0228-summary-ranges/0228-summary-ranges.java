class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list=new ArrayList<>();
        int one;
        int index1;
        for(int i=0;i<nums.length;i++){
            one=nums[i];
            index1=i;
            while((i<nums.length-1)&&(nums[i+1]==nums[i]+1)){
                 i++;
            }
            if(index1!=i){
            StringBuilder sb = new StringBuilder();
            sb.append(one);
            sb.append("->");
            sb.append(nums[i]);
            String str = sb.toString(); 
            list.add(str);}
            else{
                StringBuilder sb = new StringBuilder();
                sb.append(one);
                String str = sb.toString(); 
                list.add(str);
            }
  

        }
        return list;
    }
}