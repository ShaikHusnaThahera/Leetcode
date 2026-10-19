class Solution {
    public int removeDuplicates(int[] nums) {
        int l=0;
        if(nums.length==0){
            return l;
        }
        for(int r=1;r<nums.length;r++){
            if(nums[r]!=nums[l]){
                l++;
                nums[l]=nums[r];
            }
        }
        return l+1;
    }
}