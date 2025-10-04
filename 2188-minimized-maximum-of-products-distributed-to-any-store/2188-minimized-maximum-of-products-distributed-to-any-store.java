class Solution {
    public static boolean fun(int nums[],int n,int k){
        int ans=0;
        for(int i=0;i<nums.length;i++){
            ans=nums[i];
            while(ans >=k){
                ans-=k;
                n-=1;
            }
            if(ans <k && ans!=0){
                ans=0;
                n-=1;
            }
        }
            if(n<0){
                return false;
            }
        return true;
    }
    public int minimizedMaximum(int n, int[] quantities) {
        int l=1,r=(int)Math.pow(10,5);
        while(l<=r){
            int m=l+(r-l)/2;
            if(fun(quantities,n,m)){
                r=m-1;
            }
            else{
                l=m+1;
            }
        }
        return l;
    }
}