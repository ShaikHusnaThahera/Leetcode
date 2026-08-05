class Solution {
    public static int gcd(int max,int min){
        int temp=0;
        while(min>0){
            temp=min;
        min=max%min;
        max=temp;
        }
        return max;
    }
    public int findGCD(int[] nums) {
        int max=nums[0];
        int min=nums[0];
        for(int i=0;i<nums.length;i++){
           max=Math.max(max,nums[i]);
           min=Math.min(min,nums[i]);
        }
        return gcd(max,min);
    }
}