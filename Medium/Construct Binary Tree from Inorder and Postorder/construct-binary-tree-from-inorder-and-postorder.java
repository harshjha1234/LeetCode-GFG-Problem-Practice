//{ Driver Code Starts
import java.util.*;

class Node {
    int data;
    Node left;
    Node right;

    Node(int value) {
        data = value;
        left = null;
        right = null;
    }
}

class InorderPostorderToTree {
    public void preOrder(Node root) {
        if (root == null) return;

        System.out.print(root.data + " ");
        preOrder(root.left);

        preOrder(root.right);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        InorderPostorderToTree ip = new InorderPostorderToTree();
        int T = sc.nextInt();
        while (T > 0) {
            int n = sc.nextInt();
            int inorder[] = new int[n];
            int postorder[] = new int[n];
            for (int i = 0; i < n; i++) inorder[i] = sc.nextInt();
            for (int i = 0; i < n; i++) postorder[i] = sc.nextInt();
            GfG g = new GfG();
            Node root = g.buildTree(inorder, postorder, n);
            ip.preOrder(root);
            System.out.println();

            T--;
        }
    }
}

// } Driver Code Ends


/* Tree node structure
class Node
{
    int data;
    Node left;
    Node right;

        Node(int value)
    {
        data = value;
        left = null;
        right = null;
    }
}*/


class GfG
{
    //Function to return a tree created from postorder and inoreder traversals.
    Node findtheNode(int[] in, int[] post, int start, int end, List<Integer> index) {
        if (index.get(0) == -1 || start > end) return null;
        int divfact = -1;
        for (int i = start; i <= end; i++) {
            if (post[index.get(0)] == in[i]) {
                divfact = i;
                break;
            }
        }
        int t = index.get(0);
        Node node = new Node(post[index.get(0)]);
        index.remove(0);
        index.add(t - 1);
        node.right = findtheNode(in, post, divfact + 1, end, index);
        node.left = findtheNode(in, post, start, divfact - 1, index);
        return node;
    }
    
    Node buildTree(int in[], int post[], int n) {
        List<Integer> index = new ArrayList<>();
        index.add(n - 1);
        return findtheNode(in, post, 0, n - 1, index);
    }
}
