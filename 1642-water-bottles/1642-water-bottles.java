class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int q,r,buy;
       buy =numBottles;
        while(numBottles >= numExchange){
        q=numBottles/numExchange;
        r=numBottles%numExchange;
        numBottles=q+r;
        buy=buy+q;
        }
    return buy;
    }
}
