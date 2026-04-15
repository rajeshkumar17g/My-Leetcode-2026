class Solution:
    def closestTarget(self, words: List[str], target: str, startIndex: int) -> int:
        if target==words[startIndex]:
            return 0
        i=(startIndex+1)%len(words)
        distance=float('inf')
        while i!=startIndex:
            if target==words[i]:
                if abs(i-startIndex)<distance:
                    distance=abs(i-startIndex)
                if len(words)-abs(i-startIndex)<distance:
                    distance=len(words)-abs(i-startIndex)
            i=(i+1)%len(words)
        return -1 if distance==float('inf') else distance 