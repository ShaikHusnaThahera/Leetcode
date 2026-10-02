class Solution {
    public int climbStairs(int n) {
        int dp[]=new int[n+1];
        if(n<=2){
            return n;
        }
        dp[1]=1;
        dp[2]=2;
        for(int i=3;i<n+1;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
        // int n1=0;
        // int n2=1;
        // int count=0;
        // while(n>0){
        //     count=n1+n2;
        //     n1=n2;
        //     n2=count;
        //     n--;
        // }
        // return count;
    }
}