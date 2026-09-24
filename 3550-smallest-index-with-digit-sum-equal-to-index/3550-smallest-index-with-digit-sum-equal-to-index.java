class Solution {
    public static int sumofdig(int n){
        int sum=0;
        while(n>0){
            int dig=n%10;
            sum=sum+dig;
            n=n/10;
        }
        return sum;
    }
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int n=sumofdig(nums[i]);
            if(i==n){
                return i;
            }
        }
        return -1;
    }
}