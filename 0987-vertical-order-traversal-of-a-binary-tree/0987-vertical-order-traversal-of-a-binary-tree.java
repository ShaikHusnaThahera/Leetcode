/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Tuple{
TreeNode node;
int row;
int col;
public Tuple(TreeNode node,int row,int col){
    this.node=node;
    this.row=row;
    this.col=col;
}
 }
class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer,TreeMap<Integer, PriorityQueue<Integer>>> hr=new TreeMap<>();
        Queue<Tuple> q=new LinkedList<Tuple>();
        q.offer(new Tuple(root,0,0));
        while(!q.isEmpty()){
            Tuple tu=q.poll();
            TreeNode node=tu.node;
            int x=tu.row;
            int y=tu.col;
            if(!hr.containsKey(x)){
                hr.put(x,new TreeMap<>());
            }
            if(!hr.get(x).containsKey(y)){
                hr.get(x).put(y,new PriorityQueue<>());
            }
            hr.get(x).get(y).offer(node.val);
            if(node.left != null){
                q.offer(new Tuple(node.left,x-1,y+1));
            }
            if(node.right != null){
                q.offer(new Tuple(node.right,x+1,y+1));
            }
        }
        List<List<Integer>> list=new ArrayList<>();
        for(TreeMap<Integer,PriorityQueue<Integer>> res:hr.values()){
            list.add(new ArrayList<>());
            for(PriorityQueue<Integer> ys:res.values()){
                while(!ys.isEmpty()){
                    System.out.println(ys.peek());
                    list.get(list.size()-1).add(ys.poll());
                }
            }
        }
        return list;
    }
}