
class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth,
                            int need1, int need2) {

        int common = Math.min(need1, need2);

        long ans = (long) common *
                   Math.min(costBoth, cost1 + cost2);

        int rem1 = need1 - common;
        int rem2 = need2 - common;

        ans += (long) rem1 * Math.min(cost1, costBoth);
        ans += (long) rem2 * Math.min(cost2, costBoth);

        return ans;
    }
}
