class Solution:
    def checkIfPangram(self, s: str) -> bool:
    
        for unicode in range(97,123):
            if chr(unicode) not in s:
                return False
        return True