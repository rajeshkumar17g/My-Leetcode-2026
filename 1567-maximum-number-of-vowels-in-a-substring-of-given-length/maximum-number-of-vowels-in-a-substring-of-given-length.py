class Solution:
    def maxVowels(self, s: str, k: int) -> int:
        max_vowels=0
        for i in range(k):
            if s[i] in 'aeiou':
                max_vowels+=1
        # assuming 1st window is our max window
        crr_vowels=max_vowels
        for i in range(1,len(s)-k+1):
            if s[i-1] in 'aeiou':
                crr_vowels-=1 # if ele chjar is vowel
            if s[i+k-1] in 'aeioiu':
                crr_vowels+=1
            if crr_vowels>max_vowels:
                max_vowels=crr_vowels

        return max_vowels


        '''
        maxvowels=0
        for i in range(0,len(s)-k+1):
            crr_vowels=0
            for j in range(i,i+k):
                if s[j] in 'aeiou':
                    crr_vowels+=1
                
            if crr_vowels>maxvowels:
                maxvowels=crr_vowels
        
        return maxvowels
    '''
        
