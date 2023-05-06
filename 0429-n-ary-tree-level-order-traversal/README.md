429. N-ary Tree Level Order Traversal

Given an n-ary tree, return the level order traversal of its nodes' values.

Nary-Tree input serialization is represented in their level order traversal, each group of children is separated by the null value (See examples).

 

Example 1:

<img src="https://user-images.githubusercontent.com/74855047/236633179-1738201f-33ec-430a-b7e8-91d0ac80a889.png">


Input: root = [1,null,3,2,4,null,5,6]
Output: [[1],[3,2,4],[5,6]]
Example 2:

<img src="https://user-images.githubusercontent.com/74855047/236633192-ae3be2f6-96f7-4b27-8c22-a06046ffa5ff.png">


Input: root = [1,null,2,3,4,5,null,null,6,7,null,8,null,9,10,null,null,11,null,12,null,13,null,null,14]
Output: [[1],[2,3,4,5],[6,7,8,9,10],[11,12,13],[14]]
 

Constraints:

The height of the n-ary tree is less than or equal to 1000
The total number of nodes is between [0, 104]
