class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> hr=new HashMap<>();
        for(int i=0;i<s.length();i++){
            hr.put(s.charAt(i),hr.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0;i<s.length();i++){
            if(hr.get(s.charAt(i))==1)
            return i;
        }
        return -1;
    }
}