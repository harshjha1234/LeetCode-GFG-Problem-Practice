<h3>450. Delete Node in a BST</h3>
<br>
<br>
Given a root node reference of a BST and a key, delete the node with the given key in the BST. Return the <b>root node reference</b> (possibly updated) of the BST.<br>
Basically, the deletion can be divided into two stages:<br>
Search for a node to remove.<br>
If the node is found, delete the node.<br>
<br> 
<br>
<b>Example 1:</b><br>
<br>
Input: root = [5,3,6,2,4,null,7], key = 3<br>
Output: [5,4,6,2,null,null,7]<br>
Explanation: Given key to delete is 3. So we find the node with value 3 and delete it.<br>
One valid answer is [5,4,6,2,null,null,7], shown in the above BST.<br>
Please notice that another valid answer is [5,2,6,null,4,null,7] and it's also accepted.<br>
<br>
<b>Example 2:</b><br>
<br>
Input: root = [5,3,6,2,4,null,7], key = 0<br>
Output: [5,3,6,2,4,null,7]<br>
Explanation: The tree does not contain a node with value = 0.<br>
<br>
<b>Example 3:</b><br>
<br>
Input: root = [], key = 0<br>
Output: []<br>
<br>
<br>
<b>Constraints:</b><br>
<br>
The number of nodes in the tree is in the range [0, 10^4].<br>
-10^5 <= Node.val <= 10^5<br>
Each node has a unique value.<br>
root is a valid binary search tree.<br>
-10^5 <= key <= 10^5<br>
