class Solution {
    public static boolean isPossible(int bloomDay[],int m,int k,int d){
        int ans=0;
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]<=d){
                ans+=1;
            }
            else{
                ans=0;
            }
            if(ans==k){
                m-=1;
                ans=0;
            }
            if(m==0){
                return true;
            }
        }
        return false;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int tempr=(int)Math.pow(10,9);
        int l=1;
        int r=tempr;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(isPossible(bloomDay,m,k,mid)){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
         if(l == tempr+1){
           return -1;
        }
        return l;
    }
}