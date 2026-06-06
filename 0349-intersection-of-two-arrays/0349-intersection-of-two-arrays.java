class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums2);
        ArrayList<Integer> hr=new ArrayList<>();
         //int size=Math.min(nums1.length,nums2.length);
        for(int i=0;i<nums1.length;i++){
            int l=0;int r=nums2.length-1;
            while(l<=r){
            int m=l+(r-l)/2;
            if(nums1[i]==nums2[m]){
                if(!hr.contains(nums2[m]))
                hr.add(nums1[i]);
                break;
            }
            else if(nums2[m]>nums1[i]){
                r=m-1;
                continue;
            }
            else{
                l=m+1;
                continue;
            }
        }
    }
    int arr[]=new int[hr.size()];
    for(int i=0;i<hr.size();i++) {
    arr[i]=hr.get(i);
}
    return arr;
    }
}