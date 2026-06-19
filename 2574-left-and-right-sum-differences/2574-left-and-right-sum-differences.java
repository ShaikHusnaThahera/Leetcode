class Solution {
    public int[] leftRightDifference(int[] nums) {
        int left[]=new int[nums.length];
        int right[]=new int[nums.length];
        left[0]=0;
        right[nums.length-1]=0;
        for(int i=1;i<left.length;i++){
            left[i]=nums[i-1]+left[i-1];
            //  System.out.print(left[i]+" ");
        }
        for(int i=right.length-2;i>=0;i--){
            right[i]=nums[i+1]+right[i+1];
            //  System.out.print(right[i]+" ");
        }
        int res[]=new int[right.length];
        for(int i=0;i<res.length;i++){
            res[i]=Math.abs(left[i]-right[i]);
            //  System.out.print(res[i]+" ");
        }
        return res;
    }
}