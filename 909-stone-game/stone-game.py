#translated by AI
class Solution:
    def stoneGame(self, piles):
        n = len(piles)
        dp = [[0] * n for _ in range(n)]

        for i in range(n):
            dp[i][i] = piles[i]

        for length in range(2, n + 1):
            for i in range(n - length + 1):
                j = i + length - 1

                takeLeft = piles[i] - dp[i + 1][j]
                takeRight = piles[j] - dp[i][j - 1]

                dp[i][j] = max(takeLeft, takeRight)

        return dp[0][n - 1] > 0