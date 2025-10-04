class Solution {
    public static boolean isPossible(int nums[],int h, int k){
        int ans =0;
        for(int i=0;i<nums.length;i++){
        ans=nums[i]/k;    
        
        if(nums[i]%k !=0 ){
            ans++;
        }
        h-=ans;
        if(h<0){
            return false;
        }
        }
        return true;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int l=1,r=(int)Math.pow(10,9);
        while(l<=r){
            int m=l+(r-l)/2;
            if(isPossible(piles,h,m)){
                r=m-1;
            }
            else{
                l=m+1;
            }
        }
        return l;
    }
}