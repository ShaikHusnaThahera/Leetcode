class Solution {
    public int uniqcount(int s,int e,List<Integer> nums){
        // if(!hr.contains(i))
        HashSet<Integer> hr=new HashSet<>();
        for (int i=s;i<=e;i++) {
            hr.add(nums.get(i));
        }
        return hr.size();
    }
    public int sumCounts(List<Integer> nums) {
        int n=nums.size();
        int ans=0;
        for(int s=0;s<n;s++){
            for(int e=s;e<n;e++){
                int c=uniqcount(s,e,nums);
                ans+=c*c;
            }
        }
        return ans;
    }
}