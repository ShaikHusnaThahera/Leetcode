class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> hr=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            String ch=words[i];
            int k=0;
            while(k<ch.length()){
                if(ch.charAt(k)==x){
                hr.add(i);
                break;
                }
                k++;
            }
        }
        return hr;
    }
}