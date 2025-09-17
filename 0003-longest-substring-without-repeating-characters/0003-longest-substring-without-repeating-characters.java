class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hr=new HashSet<>();
        int l=0,ans=0;
        for(int r=0;r<s.length();r++){
            char ch=s.charAt(r);
            if(!hr.contains(ch)){
                hr.add(ch);
            }
            else{
                while(hr.contains(ch)){
                    hr.remove(s.charAt(l));
                    l++;
                }
                hr.add(ch);
            }
            ans=Math.max(ans,r-l+1);
        }
return ans;
    }
}