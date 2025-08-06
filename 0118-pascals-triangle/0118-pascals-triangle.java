class Solution {
    public List<List<Integer>> generate(int r) {
         List<List<Integer>> hr= new ArrayList<>();
        List<Integer> fr= new ArrayList<>();
        fr.add(1);
        hr.add(fr);
            for(int i=1;i<r;i++){
        List<Integer> temp=new ArrayList<>();
         temp.add(1);
         for(int j=1;j<i;j++){
             int val=hr.get(i-1).get(j)+hr.get(i-1).get(j-1);
             temp.add(val);
         }
         temp.add(1);
         hr.add(temp);
         
        }
        
            return hr;
    }
}