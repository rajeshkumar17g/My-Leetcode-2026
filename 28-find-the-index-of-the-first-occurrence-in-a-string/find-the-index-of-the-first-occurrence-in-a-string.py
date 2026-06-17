class Solution:
    def strStr(self, haystack: str, needle: str) -> int:
        n=len(haystack)
        m=len(needle)
        lps=[0]*m

        prevLPS=0
        i=1
        while i<m:
            if needle[i]==needle[prevLPS]:
                lps[i]=prevLPS+1
                prevLPS+=1
                i+=1
            elif prevLPS==0:
                lps[i]=0
                i=i+1
            else:
                prevLPS=lps[prevLPS-1]
        

        i=0
        j=0
        while i<n:
            if haystack[i]==needle[j]:
                i=i+1
                j=j+1
            else:
                if j==0:
                    i=i+1
                else:
                    j=lps[j-1]
            if j==m:
                return i-m
        return -1
            











