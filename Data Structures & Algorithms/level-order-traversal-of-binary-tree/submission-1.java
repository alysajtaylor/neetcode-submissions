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
    public List<List<Integer>> levelOrder(TreeNode root) {
        // catch empty root
        if(root == null) return List.of();
        // set up queue & result list
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        List<List<Integer>> result = new ArrayList<>();
        
        while(!queue.isEmpty()) {
            // track size of queue
            int size = queue.size();
            // list to track values on a level
            List<Integer> nodes = new ArrayList<>();
            
            // the size of the queue tells us how many
            // nodes to process before moving to the next level
            for(int itr = 0; itr < size; itr++){
                // process curr node & add to list
                TreeNode curr = queue.remove();
                nodes.add(curr.val);
                // add left/right to queue
                if(curr.left != null) {
                    queue.add(curr.left);
                }
                if(curr.right != null){
                    queue.add(curr.right);
                }
            }
            // add the nodes list to the results list
            result.add(nodes);
        }
        return result;
    }
}
