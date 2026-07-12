class Solution:
    def totalNQueens(self, n: int) -> int:
        def is_valid(x2,y2,board):
            for x1 in range(x2):
                y1=board[x1]
                if(y1==y2 or abs(x1-x2)==abs(y1-y2)):
                    return False
            return True
        #-------------------------------------------------
        def backtrack(row,board):
            if row==n:
                sol=[]
                for col in board:
                    row_list=['.']*n
                    row_list[col]='Q'
                    sol.append(''.join(row_list))
                    
                res.append(sol)
                return
            
            for col in range(n):
                if(is_valid(row,col,board)):
                    board[row]=col
                    backtrack(row+1,board)
                    board[row]=-1
        res=[]
        board=[-1]*n # empty board [-1,-1,-1,-1]
        backtrack(0,board)
        return len(res)