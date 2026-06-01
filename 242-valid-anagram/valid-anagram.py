class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        arr1=[0]*26
        for ch in s:
            index=ord(ch)%97
            arr1[index]+=1

        arr2=[0]*26
        for ch in t:
            index=ord(ch)%97
            arr2[index]+=1
        
        return arr1==arr2