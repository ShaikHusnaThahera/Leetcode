class Solution {
    public int maxSubArray(int[] nums) {
        int ans=nums[0],res=nums[0];
        for(int i=1;i<nums.length;i++){
            ans=Math.max(nums[i],ans+nums[i]);
            res=Math.max(ans,res);
        }
        return res;
    }
}