class Solution {
    public int minimumCost(int[] cost) {
        int ans=0;
       Arrays.sort(cost);
       for (int i = 0, j = cost.length - 1; i < j; i++, j--) {
            int temp = cost[i];
            cost[i] = cost[j];
            cost[j] = temp;
        }
       for(int i=0;i<cost.length;i=i+3){
           ans=ans+cost[i];
           if(i+1<cost.length){
               ans=ans+cost[i+1];
           }
       }
       return ans;
    }
}