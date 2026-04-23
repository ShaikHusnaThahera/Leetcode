class Solution {
    public long[] distance(int[] nums) {
        int n = nums.length;
        long[] res = new long[n];

        Map<Integer, List<Integer>> map = new HashMap<>();

        // Step 1: group indices
        for(int i = 0; i < n; i++) {
            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }

        // Step 2: process each group
        for(List<Integer> list : map.values()) {

            int size = list.size();

            // total sum of indices
            long total = 0;
            for(int x : list) total += x;

            long leftSum = 0;

            for(int i = 0; i < size; i++) {
                int index = list.get(i);

                long rightSum = total - leftSum - index;

                // left part
                long left = (long)i * index - leftSum;

                // right part
                long right = rightSum - (long)(size - i - 1) * index;

                res[index] = left + right;

                // update leftSum
                leftSum += index;
            }
        }

        return res;
    }
}