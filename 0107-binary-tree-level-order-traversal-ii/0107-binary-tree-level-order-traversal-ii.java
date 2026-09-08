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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Queue<TreeNode> s=new LinkedList<>();
        List<List<Integer>> hr=new ArrayList<>();
        s.offer(root);
        if(root==null){
            return hr;
        }
        while(!s.isEmpty()){
            int size=s.size();
            List<Integer> temp=new ArrayList<>();
            for(int i=0;i<size;i++){
                if(s.peek().left!=null){
                    s.offer(s.peek().left);
                }
                if(s.peek().right!=null){
                    s.offer(s.peek().right);
                }
                temp.add(s.poll().val);
            }
            hr.add(temp);
        }
        Collections.reverse(hr);
        return hr;
    }
}