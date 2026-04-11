class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n=arr.length;
        int mod=(int)1e9 + 7;
        // System.out.println()
        int[] nse=findNse(arr);
        int[] pse=findPse(arr);
        long total=0;
        for(int i=0;i<n;i++){
            long left=i-nse[i];
            long right=pse[i]-i;
            total=(total+(left*right%mod)*arr[i]%mod)%mod;
        }
        return (int)total;
    }
    public int[] findNse(int nums[]){
        int n=nums.length;
        int nse[]=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty()&& nums[st.peek()]>nums[i]){
                st.pop();
            }
            if(st.isEmpty()){
                nse[i]=n;
            }
            else{
                nse[i]=st.peek();
            }
            st.push(i);
        }
        return nse;
    }
    public static int[] findPse(int nums[]){
        int n=nums.length;
        Stack<Integer> st=new Stack<>();
        int pse[]=new int[n];
        for(int i=0;i<n;i++){
            while(!st.isEmpty()&& nums[st.peek()]>=nums[i]){
                st.pop();
            }
            if(st.isEmpty()){
                pse[i]=-1;
            }
            else{
                pse[i]=st.peek();
            }
            st.push(i);
        }
        return pse;
    }
    
    }
