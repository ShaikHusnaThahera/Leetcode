class Solution {
    public int minimumDifference(int[] nums, int k) {
        int n=nums.length;
        int temp=0;
        int ans=Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i=0;i<=n-k;i++){
            int maxi=Integer.MIN_VALUE;
            int mini=Integer.MAX_VALUE;
            for(int j=i;j<i+k;j++){
                maxi=Math.max(maxi,nums[j]);
                mini=Math.min(mini,nums[j]);
            }
            ans=Math.min(ans,maxi-mini);
        }
        return ans;
    }
}