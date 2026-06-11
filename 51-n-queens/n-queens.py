class Solution:
    def solveNQueens(self, n: int) -> List[List[str]]:
        def convert(board):
            sol=[]
            for col in board:  #[1,3,0,2]
                row=['.']*n
                row[col]='Q' # ['.','Q','.','.']
                sol.append(''.join(row))
            return sol


        def is_valid(x2,y2,board):
            for x1 in range(x2):
                if y2==board[x1] or abs(x1-x2)==abs(board[x1]-y2):
                    return False # not a valid placement
            return True 
        #------------------------------------------
        def backtracking(board,row):
            if row==n:
                res.append(convert(board[:])) # adds a copy of board
                return
            
            for col in range(0,n): # col => 0 ,1,.... n-1
                if is_valid(row,col,board):
                    board[row]=col # make the move
                    backtracking(board,row+1) # explore the path
                    board[row]=-1 # undo the move

        #---------------------------------------
        res=[]                     #.row    0. 1. 2. 3.  ==> board[row]=> col
        board=[-1]*n # n=4.   board=[-1,-1,-1,-1] # col locations of Queens
        backtracking(board,0) # row=0. board=[-1,-1,-1,-1]
        return res