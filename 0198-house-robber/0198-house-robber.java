class Solution {
   static int memo[];
    public int rob(int[] nums) {
        int n=nums.length;
         memo=new int[100];
         Arrays.fill(memo,-1);
        return recur(n-1,nums);
    }
    public static int recur(int n,int nums[]){
        if(n==0) return nums[0];
        if(n==1) return Math.max(nums[0],nums[1]);
        if(memo[n]!=-1) return memo[n];
        memo[n]=Math.max(nums[n]+recur(n-2,nums), recur(n-1,nums));
        return memo[n];
    }
}