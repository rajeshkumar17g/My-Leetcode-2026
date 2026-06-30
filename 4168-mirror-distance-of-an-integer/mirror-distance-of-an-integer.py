class Solution:
    def mirrorDistance(self, n: int) -> int:
        dup=n
        rev=0
        while n!=0:
            dig=n%10
            rev=rev*10+dig
            n=n//10
        return abs(dup-rev)