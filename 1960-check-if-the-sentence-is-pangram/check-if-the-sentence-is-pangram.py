class Solution:
    def checkIfPangram(self, sentence: str) -> bool:
        seen=set()
        for ch in sentence:
            seen.add(ch)
        return len(seen)==26