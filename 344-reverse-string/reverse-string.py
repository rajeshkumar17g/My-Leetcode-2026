class Solution:
    def reverseString(self, s: List[str]) -> None:
        """
        Do not return anything, modify s in-place instead.
        s.reverse()
        s[:]=s[::-1]

        s=['h','e','l','l','o']
            L               R
        s=['o','e','l','l','h']
                L       R
        s=['o','l','l','e','h']
                    LR
        s=['o','l','l','e','h']
                R       L

        L<=R
        """
        left=0
        right=len(s)-1
        while left<=right:
            s[left],s[right]=s[right],s[left]
            left=left+1
            right=right-1
        