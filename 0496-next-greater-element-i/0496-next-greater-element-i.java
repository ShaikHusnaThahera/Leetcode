class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int res[]=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            int n=nums1[i];
            int index=-1;
            for(int j=0;j<nums2.length;j++){
                if(n==nums2[j]){
                    index=j;
                    break;
                }
            }
            int nge=-1;
            if(index==-1) res[i]=nge;
            else{
                for(int k=index+1;k<nums2.length;k++){
                    if(nums2[k]>n){
                        nge=nums2[k];
                        break;
                    }
                }
                res[i]=nge;
            }
        }
        return res;
    }
}