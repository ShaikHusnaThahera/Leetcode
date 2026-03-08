class Solution {
    public boolean fun(HashMap<Character,Integer> hr1,HashMap<Character,Integer> hr2){
            if(hr1.size()!=hr2.size()){
                return false;
            }
            for(char key:hr1.keySet()){
                if(!hr2.containsKey(key)){
                    return false;
                }
                int a=hr1.get(key);
                int b=hr2.get(key);
                if(a!=b){
                    return false;
                }
            }
        return true;
    }
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> hr1=new HashMap<>();
        HashMap<Character,Integer> hr2=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch1=s.charAt(i);
            hr1.put(ch1,hr1.getOrDefault(ch1,0)+1);
        }
        for(int i=0;i<t.length();i++){
            char ch2=t.charAt(i);
            hr2.put(ch2,hr2.getOrDefault(ch2,0)+1);
        }
     return fun(hr1,hr2);
    }
}