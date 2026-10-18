class Solution {
    static final int mod=1000000007;
    long [][]comb;
    public int numOfWays(int[] nums) {
       int n=nums.length;
       comb=new long[n+1][n+1];
       for(int i=0;i<=n;i++){
        comb[i][0]=1;
        comb[i][i]=1;
        for(int j=1;j<i;j++){
            comb[i][j]=(comb[i-1][j-1]+comb[i-1][j])%mod;
        }
       }
        return (int)((solve(nums)-1+mod)%mod);
    }
        private long solve(int nums[]){
            int n=nums.length;
            if(n<=2){
                return 1;
            }
            int root=nums[0];
            List<Integer> left=new ArrayList<>();
            List<Integer> right=new ArrayList<>();
            for(int i=1;i<n;i++){
                if(nums[i]<root){
                    left.add(nums[i]);
                }
                else{
                    right.add(nums[i]);
                }
            }
            long leftways=solve(toArray(left));
            long rightways=solve(toArray(right));
            long ways=comb[n-1][left.size()];
            ways=ways*leftways%mod;
            ways=ways*rightways%mod;
            return ways;
        }
        private int[] toArray(List<Integer> list){
            int arr[]=new int[list.size()];
            for(int i=0;i<list.size();i++){
                arr[i]=list.get(i);
            }
            return arr;
        }
    }
