class Solution:
    def isCousins(self, root: TreeNode, x: int, y: int) -> bool:
		# store (parent, depth) tuple
                res = [] 
                
                # dfs
                def dfs(node, parent, depth):
                    if not node:
                        return
                    if node.val == x or node.val == y:
                        res.append((parent, depth))
                    dfs(node.left, node, depth + 1)
                    dfs(node.right, node, depth + 1)
                    
                dfs(root, None, 0)

                # unpack two nodes found
                node_x, node_y = res  
                
                # compare and decide whether two nodes are cousins
                return node_x[0] != node_y[0] and node_x[1] == node_y[1]