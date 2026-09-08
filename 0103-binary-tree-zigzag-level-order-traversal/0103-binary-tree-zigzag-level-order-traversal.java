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
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
       ArrayList<List<Integer>> hr=new ArrayList<>();
       Queue<TreeNode> q=new LinkedList<>();
       q.offer(root);
       boolean flag=false;
       if(root==null){
        return hr;
       }
       while(!q.isEmpty()){
        int s=q.size();
        ArrayList<Integer> temp=new ArrayList<>();
        for(int i=0;i<s;i++){
            if(q.peek().left!=null){
                q.offer(q.peek().left);
            }
            if(q.peek().right!=null){
                q.offer(q.peek().right);
            }
            temp.add(q.poll().val);
        }
        flag=!flag;
        if(!flag) Collections.reverse(temp);
        hr.add(temp);
       }
       return hr;
    }
}