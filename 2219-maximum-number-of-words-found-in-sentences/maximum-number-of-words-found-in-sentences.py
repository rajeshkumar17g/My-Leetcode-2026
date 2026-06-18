class Solution:
    def mostWordsFound(self, sentences: List[str]) -> int:
        res=[]
        for string in sentences:
            res.append(len(string.split()))
        return max(res)