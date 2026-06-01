class Solution:
    def checkIfPangram(self, s: str) -> bool:
    
        arr=[0]*26
        for ch in s:
            arr[ord(ch)%97]=1
        return sum(arr)==26
        '''
        for unicode in range(97,123):
            if chr(unicode) not in s:
                return False
        return True
        '''