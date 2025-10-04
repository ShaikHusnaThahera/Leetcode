class Solution {
    public static boolean isp(int nums[],int m,int k){
        int p=nums[0];
        m-=1;
        for(int i=0;i<nums.length;i++){
            int val=nums[i];
            if(val-p>=k){
                m-=1;
                p=val;
            }
            if(m<=0){
                return true;
            }
        }
        return false;
    }
    public int maxDistance(int[] position, int m) {
        int l=1,r=(int)Math.pow(10,9);
        Arrays.sort(position);
        while(l<=r){
            int mid=l+(r-l)/2;
            if(isp(position,m,mid)){
                l=mid+1;
            }
            else{
                 r=mid-1;
            }
        }
        return r;
    }
}