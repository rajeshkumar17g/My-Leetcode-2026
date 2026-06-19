class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        hashtable=[0]*26
        for ch in s:
            index=ord(ch)-97
            hashtable[index]+=1
        for ch in t:
            index=ord(ch)-97
            hashtable[index]-=1
        
        for ele in hashtable:
            if ele!=0:
                return False
        return True