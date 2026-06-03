class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        n=len(matrix)
        m=len(matrix[0])

        top=0
        bottom=n-1
        left=0
        right=m-1
        res=[]

        while top<=bottom and left<=right:
            #left to right
            for i in range(left,right+1):
                res.append(matrix[top][i])
            top+=1

            # top -> bottom
            for i in range(top,bottom+1):
                res.append(matrix[i][right])
            right-=1

            # right to left
            if top<=bottom:
                for i in range(right,left-1,-1):
                    res.append(matrix[bottom][i])
                bottom-=1

            # bottom to top
            if left<=right:
                for i in range(bottom,top-1,-1):
                    res.append(matrix[i][left])
                left+=1
        return res
