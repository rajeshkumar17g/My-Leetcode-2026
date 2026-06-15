class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        if s=="":
            return 0
        max_length=1
        left=0

        seen={}

        for right,ch in enumerate(s):
            while ch in seen:
                seen.pop(s[left])
                left+=1
            seen[ch]=right
            max_length=max(max_length,right-left+1)
        return max_length
