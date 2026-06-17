class Solution:
    def strStr(self, haystack, needle):
        m=len(needle)
        for i in range(len(haystack)-m+1):
            if haystack[i:i+m]==needle:
                return i
        return -1