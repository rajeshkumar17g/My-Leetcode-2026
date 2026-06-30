class Solution:
    def countDigitOccurrences(self, nums: list[int], digit: int) -> int:
        c=0
        for n in nums:
            while n!=0:
                if n%10==digit:
                    c+=1
                n=n//10
        return c