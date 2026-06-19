class Solution:
    def firstUniqChar(self, s: str) -> int:
        seen=[]
        for index in range(len(s)):
            if s[index] not in s[index+1:] and s[index] not in seen:
                return index
            seen.append(s[index])
        return -1