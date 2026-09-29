class Solution {
    public boolean isPerfectSquare(int num) {
        // if(num==1 || num==0){
        //     return true;
        // }
        // if(num==100000001){
        //     return false;
        // }
        // for(int i=0;i<num;i++){
        //     if(i*i==num){
        //         return true;
        //     }
        // }
        // return false;
        // int nums[]=new int[num];
        // for(int i=0;i<nums.length;i++){
        //     nums[i]=i+1;
        // }
        int l=0;
        int r=num;
        while(l<=r){
            long mid=l+(r-l)/2;
            if(mid*mid==num){
                return true;
            }
            else if(mid*mid>num){
                r=(int)mid-1;
            }
            else{
            l=(int)mid+1;
            }
        }
        return false;
    }
}