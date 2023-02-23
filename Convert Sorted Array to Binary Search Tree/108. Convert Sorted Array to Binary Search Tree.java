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
    public TreeNode sortedArrayToBST(int[] nums) {
       return inOrder(nums, 0, nums.length - 1);
    }

    private TreeNode inOrder(int nums[], int leftS, int rightS) {
        if (leftS > rightS) { 
            return null;
        }
        int middle = (leftS + rightS) / 2;
        TreeNode root = new TreeNode(nums[middle]);  
        root.left = inOrder(nums, leftS, middle - 1); 
        root.right = inOrder(nums, middle + 1, rightS);
        return root;
    }
}
