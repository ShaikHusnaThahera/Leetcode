class Solution {
        public static int leftsum(int num[],int mid){
            int lsum=0;
            for(int i=0;i<mid;i++){
                lsum+=num[i];
            }
            return lsum;
        }
        public static int rightsum(int num[],int mid){
            int rsum=0;
            for(int i=mid;i<num.length;i++){
                rsum+=num[i];
            }
            return rsum;
        }
        public int pivotIndex(int[] nums) {
            int lsum=0;
            int rsum=0;
            for(int mid=0;mid<nums.length;mid++){
                lsum=leftsum(nums,mid);
                rsum=rightsum(nums,mid+1);
                if(lsum==rsum){
                return mid;
    }
            }
       return -1;
    }
}