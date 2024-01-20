#User function Template for python3

'''
class Node:
    def __init__(self, val):
        self.right = None
        self.data = val
        self.left = None
'''
class TreeNode:
    def __init__(self, data=0, left=None, right=None):
        self.data = data
        self.left = left
        self.right = right

class Solution:
    def distributeCandy(self, root):
        def dfs(node=root):
            if not node:
                return 0, 0, 0
            l = dfs(node.left)
            r = dfs(node.right)
            res = abs(l[0] - l[1] + r[0] - r[1] + node.data - 1)
            return l[0] + r[0] + node.data, l[1] + r[1] + 1, res + l[2] + r[2]

        return dfs(root.left)[2] + dfs(root.right)[2]

# Example usage:
# Assuming you have a TreeNode root:
# root = TreeNode(1)
# root.left = TreeNode(2)
# root.right = TreeNode(3)
# solution = Solution()
# result = solution.distributeCandy(root)
# print(result)

    


#{ 
 # Driver Code Starts
#Initial Template for Python 3

#Initial Template for Python 3

from collections import deque
# Tree Node
class Node:
    def __init__(self, val):
        self.right = None
        self.data = val
        self.left = None

    
# Function to Build Tree   
def buildTree(s):
    #Corner Case
    if(len(s)==0 or s[0]=="N"):
        return None
        
    # Creating list of strings from input 
    # string after spliting by space
    ip=list(map(str,s.split()))
    
    # Create the root of the tree
    root=Node(int(ip[0]))                     
    size=0
    q=deque()
    
    # Push the root to the queue
    q.append(root)                            
    size=size+1 
    
    # Starting from the second element
    i=1                                       
    while(size>0 and i<len(ip)):
        # Get and remove the front of the queue
        currNode=q[0]
        q.popleft()
        size=size-1
        
        # Get the current node's value from the string
        currVal=ip[i]
        
        # If the left child is not null
        if(currVal!="N"):
            
            # Create the left child for the current node
            currNode.left=Node(int(currVal))
            
            # Push it to the queue
            q.append(currNode.left)
            size=size+1
        # For the right child
        i=i+1
        if(i>=len(ip)):
            break
        currVal=ip[i]
        
        # If the right child is not null
        if(currVal!="N"):
            
            # Create the right child for the current node
            currNode.right=Node(int(currVal))
            
            # Push it to the queue
            q.append(currNode.right)
            size=size+1
        i=i+1
    return root

    
if __name__ == '__main__':
    test_cases = int(input())
    for cases in range(test_cases):
        s=input()
        root = buildTree(s)
        ob = Solution()
        print(ob.distributeCandy(root))
        
            
# } Driver Code Ends