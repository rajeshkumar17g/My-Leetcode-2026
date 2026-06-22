class Solution:
    def maxVowels(self, s: str, k: int) -> int:
        crr_window=0
        for index in range(k):
            if s[index] in 'aeiou':
                crr_window+=1
        
        max_window=crr_window
        for index in range(1,len(s)-k+1):
            if s[index-1] in 'aeiou':
                crr_window-=1
            if s[index+k-1] in 'aeiou':
                crr_window+=1
            max_window=max(crr_window,max_window)
        return max_window