class Solution {
    public void moveZeroes(int[] nums) {
      int in=0;
      for(int num:nums){
        if(num!=0){
            nums[in++]=num;
        }
      }
      while(in<nums.length){
        nums[in++]=0;
      }
    }
}