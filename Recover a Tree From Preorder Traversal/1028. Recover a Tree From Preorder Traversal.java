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
  int index = 0;
	public TreeNode recoverFromPreorder(String s) {
		return helper(s, 0);
	}

	public TreeNode helper(String s, int depth) {
		int temp = 0;
		while (index + temp < s.length() && s.charAt(index + temp) == '-') {
			temp++;
		}
		if (temp != depth) {
			return null;
		}

		int nd = 0;
		while (index + temp + nd < s.length() && s.charAt(index + temp + nd) != '-') {
			nd++;
		}
		int val = Integer.parseInt(s.substring(index + temp, index + temp + nd));
		index = index + temp + nd;

		TreeNode node = new TreeNode(val);
		node.left = helper(s, depth + 1);
		node.right = helper(s, depth + 1);

		return node;
	}
}
