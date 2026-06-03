class Solution:
    def diagonalPrime(self, matrix: List[List[int]]) -> int:

        def isprime(n):
            if n<=1:
                return False
            c=0
            for i in range(2,int(sqrt(n))+1):
                if n%i==0:
                    c=1
                    break
            if c==0:
                return True
            else:
                return False
        #-------------------------------------
        max_prime=0
        n=len(matrix)
        for i in range(n):
            for j in range(n):
                if ((i==j or i+j==n-1) and isprime(matrix[i][j])==True):
                    if matrix[i][j]>max_prime:
                        max_prime=matrix[i][j]
        return max_prime