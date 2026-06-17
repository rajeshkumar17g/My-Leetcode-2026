class Solution:
    def repeatedStringMatch(self, a: str, b: str) -> int:
        def rabin_karp(string,pattern):
            n=len(string)
            m=len(pattern)
            if m>n:
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
        
        # len(b)/len(a)+1
        t=len(b)//len(a)+1
        s=a
        for count in range(t+1):
            if rabin_karp(s,b)!=-1:
                return count+1
            s=s+a
        return -1



