class Solution:
    def maxVowels(self, s: str, k: int) -> int:
        
        crr_vowels=0
        for index in range(k):
            if s[index] in 'aeiou':
                crr_vowels+=1

        max_vowels=crr_vowels
        for index in range(1,len(s)-k+1):
            if s[index-1] in 'aeiou':
                crr_vowels-=1
            if s[index+k-1] in 'aeiou':
                crr_vowels+=1
            max_vowels=max(crr_vowels,max_vowels)
        return max_vowels
            
