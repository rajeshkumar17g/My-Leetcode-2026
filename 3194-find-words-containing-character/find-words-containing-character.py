class Solution:
    def findWordsContaining(self, words: List[str], x: str) -> List[int]:
        res=[]
        for index in range(len(words)):
            if x in words[index]:
                res.append(index)
        return res