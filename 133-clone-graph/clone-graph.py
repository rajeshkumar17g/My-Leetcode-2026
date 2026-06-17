"""
# Definition for a Node.
class Node:
    def __init__(self, val = 0, neighbors = None):
        self.val = val
        self.neighbors = neighbors if neighbors is not None else []

        {org_node_address:clone_node_address}
"""

from typing import Optional
class Solution:
    def cloneGraph(self, node: Optional['Node']) -> Optional['Node']:
        if not node:
            return node
        def dfs(node):
            if node in created:
                return created[node]
            dup=Node(node.val)
            created[node]=dup #creates a copy of org node
            for neig in node.neighbors:
                dup.neighbors.append(dfs(neig))
            return dup
        #-------------------------------------------------------
        created={}
        return dfs(node)

