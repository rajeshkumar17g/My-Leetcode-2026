class Solution:
    def checkInclusion(self, s1: str, s2: str) -> bool:

        if(len(s1)>len(s2)):
            return False
        arr1=[0]*26
        arr2=[0]*26

        for ch in s1:
            index=ord(ch)-97
            arr1[index]=arr1[index]+1
        
        n=len(s1)
        k=n

        for i in range(0,n):
            index=ord(s2[i])-97
            arr2[index]=arr2[index]+1
        
        if(arr1==arr2):
            return True
        
        for i in range(1,len(s2)-k+1):
            before=ord(s2[i-1])-97
            arr2[before]=arr2[before]-1
            
            after=ord(s2[i+k-1])-97
            arr2[after]=arr2[after]+1
            
            if(arr1==arr2):
                return True
        return False