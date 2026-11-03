class Solution:
    def maxScore(self, cardPoints: list[int], k: int) -> int:
        curr = sum(cardPoints[:k])
        best = curr
        for i in range(1, k + 1):
            curr += cardPoints[-i] - cardPoints[k - i]
            best = max(best, curr)
        return best