<h3>700. Search in a Binary Search Tree</h3><br>
You are given the root of a binary search tree (BST) and an integer val.<br>
Find the node in the BST that the node's value equals val and return the subtree rooted with that node. If such a node does not exist, return null.<br>
<br>
<b>Example 1:</b><br>
<br>
<img src="https://user-images.githubusercontent.com/74855047/221425523-b6bc2661-511c-4031-96d1-f23596e274e8.png">
Input: root = [4,2,7,1,3], val = 2<br>
Output: [2,1,3]<br>
<br>
<b>Example 2:</b><br>
<br>
<img src="https://user-images.githubusercontent.com/74855047/221425701-6401647e-afda-4bc7-998d-9b2e84bed270.png">
Input: root = [4,2,7,1,3], val = 5<br>
Output: []<br>
<br> 
<b>Constraints:</b><br>
<br>
The number of nodes in the tree is in the range [1, 5000].<br>
1 <= Node.val <= 10^7<br>
root is a binary search tree.<br>
1 <= val <= 10^7<br>
