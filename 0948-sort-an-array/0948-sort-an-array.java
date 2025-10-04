class Solution {

    public void merge(int[] nums, int left, int mid, int right){
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int[] l1 = new int[n1];
        int[] l2 = new int[n2];

        for(int i=0;i<n1;i++) l1[i] = nums[left + i];
        for(int i=0;i<n2;i++) l2[i] = nums[mid + 1 + i];

        int i = 0, j=0, k = left;
        while(i < n1 && j < n2){
            if(l1[i] <= l2[j]){
                nums[k++] = l1[i++];
            } else{
                nums[k++] = l2[j++];
            }
        }

        while(i < n1) nums[k++] = l1[i++];
        while(j < n2) nums[k++] = l2[j++];
    }

    public void mergesort(int[] nums, int left, int right){
        if(left < right){
            int mid = left + (right - left) / 2;
            mergesort(nums, left, mid);
            mergesort(nums,mid+1,right);
            merge(nums,left,mid,right);
        }
    }
    public int[] sortArray(int[] nums) {
        int left = 0, right = nums.length -1;
        mergesort(nums,left,right);
        return nums;
    }
}