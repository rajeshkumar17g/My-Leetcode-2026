class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
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