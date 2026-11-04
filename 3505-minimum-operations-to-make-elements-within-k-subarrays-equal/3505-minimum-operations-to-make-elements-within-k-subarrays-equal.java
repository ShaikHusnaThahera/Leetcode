
// import java.util.*;

class Solution {

    TreeMap<Integer, Integer> low = new TreeMap<>();
    TreeMap<Integer, Integer> high = new TreeMap<>();

    int lowSize = 0, highSize = 0;
    long sumLow = 0, sumHigh = 0;

    // Add an element to low
    void addLow(int val) {
        low.put(val, low.getOrDefault(val, 0) + 1);
        lowSize++;
        sumLow += val;
    }

    // Add an element to high
    void addHigh(int val) {
        high.put(val, high.getOrDefault(val, 0) + 1);
        highSize++;
        sumHigh += val;
    }

    // Remove one occurrence
    void removeLow(int val) {
        int count = low.get(val);

        if (count == 1)
            low.remove(val);
        else
            low.put(val, count - 1);

        lowSize--;
        sumLow -= val;
    }

    void removeHigh(int val) {
        int count = high.get(val);

        if (count == 1)
            high.remove(val);
        else
            high.put(val, count - 1);

        highSize--;
        sumHigh -= val;
    }

    // Maintain balance
    void balance() {

        int target = (lowSize + highSize + 1) / 2;

        while (lowSize > target) {
            int val = low.lastKey();

            removeLow(val);
            addHigh(val);
        }

        while (lowSize < target) {
            int val = high.firstKey();

            removeHigh(val);
            addLow(val);
        }
    }

    // Insert element
    void add(int val) {

        if (low.isEmpty() || val <= low.lastKey())
            addLow(val);
        else
            addHigh(val);

        balance();
    }

    // Delete element
    void remove(int val) {

        if (low.containsKey(val))
            removeLow(val);
        else
            removeHigh(val);

        balance();
    }

    // Calculate cost using median
    long getCost() {

        long median = low.lastKey();

        return median * lowSize - sumLow
             + sumHigh - median * highSize;
    }

    public long minOperations(int[] nums, int x, int k) {

        int n = nums.length;

        // Step 1: Calculate cost of every window
        long[] cost = new long[n - x + 1];

        for (int i = 0; i < x; i++) {
            add(nums[i]);
        }

        cost[0] = getCost();

        // Sliding window
        for (int i = 1; i <= n - x; i++) {

            remove(nums[i - 1]);
            add(nums[i + x - 1]);

            cost[i] = getCost();
        }

        // Step 2: Dynamic Programming
        long INF = Long.MAX_VALUE / 4;

        long[][] dp = new long[k + 1][n + 1];

        for (int j = 1; j <= k; j++) {
            Arrays.fill(dp[j], INF);
        }

        // dp[i][0] = 0 already

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= k; j++) {

                // Choice 1: Skip current element
                dp[j][i] = dp[j][i - 1];

                // Choice 2: Select a window of size x
                if (i >= x) {

                    int start = i - x;

                    if (dp[j - 1][start] != INF) {

                        long take = dp[j - 1][start]
                                  + cost[start];

                        dp[j][i] = Math.min(
                            dp[j][i],
                            take
                        );
                    }
                }
            }
        }

        return dp[k][n];
    }
}
