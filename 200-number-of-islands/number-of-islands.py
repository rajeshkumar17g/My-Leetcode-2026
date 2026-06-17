class Solution:
    def numIslands(self, grid: List[List[str]]) -> int:
       
        rows=len(grid)
        cols=len(grid[0])

        count=0
        visited=set()

        def bfs(r,c):
            directions=[[0,+1],[0,-1],[+1,0],[-1,0]]
            q=deque()
            q.append((r,c))
            while q:
                    ro,co=q.popleft()
                    for dr,dc in directions:
                        row=ro+dr
                        col=co+dc
                        if (row in range(rows) and col in range(cols) and grid[row][col]=='1' and (row,col) not in visited):
                            visited.add((row,col))
                            q.append((row,col))
        #---------------------------------

        for r in range(rows):
            for c in range(cols):
                if grid[r][c]=='1' and (r,c) not in visited:
                    bfs(r,c)
                    count+=1
                
        return count

