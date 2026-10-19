class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        ArrayList<Integer> hr=new ArrayList<>();
        int l=0,r=nums.length-1;
        int first=-1;
        Arrays.sort(nums);
        while(l<=r){
            int mid=l+(r-l)/2;
            if(nums[mid]==target){
                first=mid;
                r=mid-1;
            }
            else if(nums[mid]>target){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        if(first==-1) {
            return hr;
        }
        while(first<nums.length && nums[first]==target) {
            hr.add(first);
            first++;
        }
        return hr;
    }
}