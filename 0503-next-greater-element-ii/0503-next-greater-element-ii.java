class Solution {
    public int[] nextGreaterElements(int[] nums) {
     int n=nums.length;
    int res[]=new int[n];
    Arrays.fill(res,-1);
     Stack<Integer> st=new Stack<>();
      for(int i=0;i<2*n;i++){
        int cid=i%n;
        while(!st.isEmpty()&&nums[cid]>nums[st.peek()]){
            res[st.pop()]=nums[cid];
        }
        if(i<n){
            st.push(i);
        }
      }
      return res;
    }
}