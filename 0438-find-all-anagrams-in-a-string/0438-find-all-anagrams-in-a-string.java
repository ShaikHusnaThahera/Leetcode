class Solution {

    // helper method from your first screenshot
    public boolean AreEqual(HashMap<Character,Integer> hms, HashMap<Character,Integer> hmp) {
        if (hms.size() != hmp.size()) {
            return false;
        }

        for (char key : hms.keySet()) {
            if (!hmp.containsKey(key)) {
                return false;
            }
            int a = hms.get(key);
            int b = hmp.get(key);
            if (a != b) {
                return false;
            }
        }
        return true;
    }

    // main method from your second screenshot
    public List<Integer> findAnagrams(String s, String p) {
        HashMap<Character,Integer> hmp = new HashMap<>();
        for (int i = 0; i < p.length(); i++) {
            char ch = p.charAt(i);
            hmp.put(ch, hmp.getOrDefault(ch, 0) + 1);
        }

        int l = 0;
        int k = p.length();
        List<Integer> ans = new ArrayList<>();
        HashMap<Character,Integer> hms = new HashMap<>();

        for (int r = 0; r < s.length(); r++) {
            char ch = s.charAt(r);
            hms.put(ch, hms.getOrDefault(ch, 0) + 1);

            if (r - l == k) {
                char tch = s.charAt(l);
                hms.put(tch, hms.getOrDefault(tch, 0) - 1);
                if (hms.get(tch) == 0) {
                    hms.remove(tch);
                }
                l++;
            }

            if (r - l + 1 == k && AreEqual(hms, hmp)) {
                ans.add(l);
            }
        }
        return ans;
    }
}
