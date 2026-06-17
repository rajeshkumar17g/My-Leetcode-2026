class Solution:
    def strStr(self, haystack, needle):
        
        def rabin_karp(string,pattern):
            n=len(string)
            m=len(pattern)
            if n<m:
                return -1
            
            d=256
            q=101 # take a large prime number to avoid collisions
            
            h=1
            p=0
            s=0
            
            for i in range(m-1):
                h=(h*d)%q
                
            for i in range(m):
                p=(p*d+ord(pattern[i]))%q # pattern hash
                s=(s*d+ord(string[i]))%q  # 1st window hash
                
            for i in range(n-m+1):
                if p==s: # we found a match # proceed with checking individual chgaracxters
                    if pattern==string[i:i+m]:
                        return i
                if i<n-m:
                    s=(d*(s-ord(string[i])*h)+ord(string[i+m]))%q
                
                    if s<0:
                        s=s+q
            return -1
        return rabin_karp(haystack,needle)