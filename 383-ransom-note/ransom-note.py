class Solution:
    def canConstruct(self, ransomNote: str, magazine: str) -> bool:
        map1={}
        for ch in magazine:
            if(ch in map1):
                map1[ch]+=1
            else:
                map1[ch]=1
        map2={}
        for ch in ransomNote:
            if(ch in map2):
                map2[ch]+=1
            else:
                map2[ch]=1
        for k,v in map2.items():
            if k not in map1 or v>map1[k]:
                return False
        return True
        