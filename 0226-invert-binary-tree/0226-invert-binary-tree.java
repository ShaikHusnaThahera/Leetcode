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
    public TreeNode invertTree(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        // ArrayList<Integer> temp=new ArrayList<>();
        // int arr[]=new int[];
        if(root==null){
            return null;
        }
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode head=q.poll();
            TreeNode temp=head.left;
            head.left=head.right;
            head.right=temp;
            if(head.left!=null){
                q.offer(head.left);
            }
            if(head.right!=null){
                q.offer(head.right);
            }
        }
        return root;
    }
}