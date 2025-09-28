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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result=new ArrayList<>();
        if(root==null)return result;

        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int levelsize=queue.size();
            double dvalue=0.0;

            for(int i=0;i<levelsize;i++){
                TreeNode cNode=queue.poll();
                dvalue+=cNode.val;
                if(cNode.left!=null) queue.offer(cNode.left);
                if(cNode.right!=null) queue.offer(cNode.right);
            }
            result.add(dvalue/levelsize);
        }
        return result;
    }
}