class Solution:
    def reverse(self, x: int) -> int:
        sign=1
        if x<0:
            sign=-1
            x=-x
        rev=0
        while x!=0:
            rev=rev*10+x%10
            x=x//10
        rev=sign*rev
        return  rev if rev in range(-2**31,2**31) else 0