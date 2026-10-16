class Solution {
    public int sumCounts(int[] nums) {
        int n = nums.length, mod = 1_000_000_007;
        long ans = 0;
        int[] last = new int[100001];
        java.util.Arrays.fill(last, -1);

        long[] sum = new long[4 * n];
        long[] sq = new long[4 * n];
        long[] lazy = new long[4 * n];

        SegTree st = new SegTree(n, sum, sq, lazy);

        for (int i = 0; i < n; i++) {
            int p = last[nums[i]];
            st.update(1, 0, n - 1, p + 1, i);
            ans = (ans + sq[1]) % mod;
            last[nums[i]] = i;
        }
        return (int) ans;
    }

    static class SegTree {
        int n;
        long[] s, q, l;
        SegTree(int n, long[] s, long[] q, long[] l) {
            this.n = n; this.s = s; this.q = q; this.l = l;
        }
        void apply(int x, int a, int b, long v) {
            long len = b - a + 1L;
            q[x] = (q[x] + 2 * v * s[x] + len * v * v) % 1_000_000_007;
            s[x] = (s[x] + len * v) % 1_000_000_007;
            l[x] += v;
        }
        void push(int x, int a, int b) {
            if (l[x] == 0 || a == b) return;
            int m = (a + b) / 2;
            apply(x * 2, a, m, l[x]);
            apply(x * 2 + 1, m + 1, b, l[x]);
            l[x] = 0;
        }
        void update(int x, int a, int b, int lo, int hi) {
            if (hi < a || b < lo) return;
            if (lo <= a && b <= hi) { apply(x, a, b, 1); return; }
            push(x, a, b);
            int m = (a + b) / 2;
            update(x * 2, a, m, lo, hi);
            update(x * 2 + 1, m + 1, b, lo, hi);
            s[x] = (s[x * 2] + s[x * 2 + 1]) % 1_000_000_007;
            q[x] = (q[x * 2] + q[x * 2 + 1]) % 1_000_000_007;
        }
    }
}