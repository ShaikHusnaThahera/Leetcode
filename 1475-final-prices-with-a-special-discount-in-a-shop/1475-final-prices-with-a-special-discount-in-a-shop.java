class Solution {
    public int[] finalPrices(int[] prices) {
        Stack<Integer> st=new Stack<>();
        int n=prices.length;
        // int nums[]=new int[n];
        for(int i=0;i<prices.length;i++){
         for(int j=i+1;j<=prices.length-1;j++){
            if(prices[j]<=prices[i]){
                prices[i]=prices[i]-prices[j];
                break;
            }
         }  
        }
        return prices;
    }
}