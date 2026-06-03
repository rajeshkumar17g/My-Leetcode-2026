class Solution:
    def transpose(self, matrix: List[List[int]]) -> List[List[int]]:
        rows=len(matrix)
        cols=len(matrix[0])
        
        res=[]
        for i in range(cols):
            row_list=[]
            for j in range(rows):
                row_list.append(matrix[j][i])
            res.append(row_list)
        return res