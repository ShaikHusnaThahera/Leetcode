class Solution {
    public int minimumCost(int[] cost) {
        int l=0,k=2,temp=0;
       Arrays.sort(cost);
       for(int r=0;r<cost.length;r++){
         temp+=cost[r];
        if(r-l == k){
            temp-=cost[l];
            l+=3;
        }
       }
       return temp;
    }
}