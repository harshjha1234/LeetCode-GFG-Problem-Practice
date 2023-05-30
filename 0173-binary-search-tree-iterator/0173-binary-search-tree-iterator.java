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
class BSTIterator {

    Queue<Integer> l;
    public BSTIterator(TreeNode root) {
        l = new LinkedList<>();
        traverseBST(root, l);
    }

    public int next() {
        return l.poll();
    }

    public boolean hasNext() {
        return !l.isEmpty();
    }

    private void traverseBST(TreeNode node, Queue<Integer> l) {
        if (node == null) {
            return;
        }
        traverseBST(node.left, l);
        l.add(node.val);
        traverseBST(node.right, l);
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */