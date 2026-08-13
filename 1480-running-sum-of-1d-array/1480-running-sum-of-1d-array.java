class Solution {
    public int[] runningSum(int[] nums) {
        int sum[]=new int[nums.length];
        sum[0]=nums[0];
        for(int j=1;j<nums.length;j++){
        sum[j]=sum[j-1]+nums[j];
        }
        return sum;
    }
}