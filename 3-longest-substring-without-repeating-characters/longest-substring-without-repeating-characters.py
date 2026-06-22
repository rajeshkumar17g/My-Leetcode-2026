class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        #  a    b   c   a   e   b   d   e   f
        #  0    1   2   3   4   5   6   7   8
        left=0
        ans=0
        seen=set()
        for right in range(len(s)):
            while left<len(s) and s[right] in seen:
                seen.remove(s[left])
                left+=1
            seen.add(s[right])
            ans=max(ans,right-left+1)

        return ans