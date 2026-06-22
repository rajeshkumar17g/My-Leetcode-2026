class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        left=0
        max_length=0

        seen=set()
        for right in range(len(s)):

            while right<len(s) and s[right] in seen:
                seen.remove(s[left])
                left+=1

            seen.add(s[right])
            max_length=max(max_length,right-left+1)
        return max_length
            
            