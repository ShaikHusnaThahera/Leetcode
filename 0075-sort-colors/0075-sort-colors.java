class Solution {
    public void sortColors(int[] nums) {
        int temp=0;
     for(int i=0;i<nums.length-1;i++){
        for(int j=0;j<(nums.length-1-i);j++){
        if(nums[j]>nums[j+1]){
             temp=nums[j];
             nums[j]=nums[j+1];
             nums[j+1]=temp;
        }
        }
     }   
     for(int num:nums)
                  System.out.print(num+" ");

    }
}