class Solution {
    public int minimumDifference(int[] nums, int k) {
        int n=nums.length;
        int temp=0;
        int ans=Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i=0;i<=n-k;i++){
            int j=i+k-1;
            ans=Math.min(ans,nums[j]-nums[i]);
        }
        return ans;
    }
}