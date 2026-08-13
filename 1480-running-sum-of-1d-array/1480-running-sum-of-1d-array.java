class Solution {
    public int[] runningSum(int[] nums) {
        // int sum[]=new int[nums.length];
        for(int j=1;j<nums.length;j++){
        nums[j]=nums[j-1]+nums[j];
        }
        return nums;
    }
}