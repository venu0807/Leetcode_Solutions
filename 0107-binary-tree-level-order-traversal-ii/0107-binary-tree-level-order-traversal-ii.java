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
        List<List<Integer>> result=new ArrayList<>();
        if(root==null)return result;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int levellen=queue.size();
            List<Integer> list=new ArrayList<>();
            for(int i=0;i<levellen;i++){
                TreeNode cNode=queue.poll();
                list.add(cNode.val);
                if(cNode.left!=null)queue.offer(cNode.left);
                if(cNode.right!=null)queue.offer(cNode.right);
            }
            result.add(0,list);
        }
        return result;
    }
}