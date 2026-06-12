class Solution:
    def validPath(self, n: int, edges: List[List[int]], source: int, destination: int) -> bool:
        def traversal(node):
            if node==destination:
                return True
            visited[node]=True
            for neigh in adjlist[node]:
                if visited[neigh]==False:
                    if traversal(neigh):
                        return True
            return False
        #-------------------------------
        adjlist=[[] for r in range(n)]

        for u,v in edges:
            adjlist[u].append(v)
            adjlist[v].append(u)

        visited=[False]*n
        return traversal(source)
