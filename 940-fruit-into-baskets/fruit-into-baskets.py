class Solution:
    def totalFruit(self, fruits: List[int]) -> int:
        left=0
        ans=0
        seen={}
        for right in range(len(fruits)):
            if fruits[right] in seen:
                seen[fruits[right]]+=1
            else:
                seen[fruits[right]]=1
            
            while left<len(fruits) and len(seen)>2:
                seen[fruits[left]]-=1
                if seen[fruits[left]]==0:
                    seen.pop(fruits[left])
                left+=1

            ans=max(ans,right-left+1)
           
        return ans
