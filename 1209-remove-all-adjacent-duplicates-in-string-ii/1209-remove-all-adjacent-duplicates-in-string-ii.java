import java.util.*;
class Solution {
    public String removeDuplicates(String s, int k) {
        // String ans="";
        // Stack<Character> hr=new Stack<>();
        Stack<Map.Entry<Character, Integer>> hr= new Stack<>();
        for(int i=0;i<s.length();i++){
            if(hr.isEmpty()){
                hr.push(new AbstractMap.SimpleEntry<>(s.charAt(i),1));
            }
            else if(s.charAt(i)==hr.peek().getKey()){
                  hr.peek().setValue(hr.peek().getValue()+1);
                
                if(hr.peek().getValue()==k){
                    hr.pop();
                }
        }
                else{
                   hr.push(new AbstractMap.SimpleEntry<>(s.charAt(i), 1));
                }
            }
       StringBuilder ans = new StringBuilder();

        while (!hr.isEmpty()) {
            Map.Entry<Character, Integer> pair = hr.pop();

            for (int i = 0; i < pair.getValue(); i++) {
                ans.append(pair.getKey());
            }
        }

        return ans.reverse().toString();
    }
}