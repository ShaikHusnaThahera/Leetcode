class Solution {
    public static int setbits(int n){
        int count=0;
        while(n>0){
            if((n&1)==1){
                count++;
            }
            n=n>>1;
        }
        return count;
    }
    public static int[] countBits(int n) {
        int nums[]=new int[n+1];
        for(int i=0;i<n+1;i++){
            nums[i]=setbits(i);
        }
        return nums;
    }
}