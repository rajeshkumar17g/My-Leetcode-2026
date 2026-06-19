class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        arr=[0]*26
        for ch in s:
            index=ord(ch)-97
            arr[index]+=1

        for ch in t:
            index=ord(ch)-97
            arr[index]-=1
        
        for ele in arr:
            if ele!=0:
                return False
        return True