class Solution:
    def restoreString(self, s: str, indices: List[int]) -> str:
        res=[0]*len(s)
        for index in range(len(s)):
            res[indices[index]]=s[index]
        return ''.join(res)
