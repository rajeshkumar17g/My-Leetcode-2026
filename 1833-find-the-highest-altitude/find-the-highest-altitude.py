class Solution:
    def largestAltitude(self, gain: List[int]) -> int:
        
        height=0
        max_height=0

        for g in gain:
            height=height+g
            max_height=max(height,max_height)
        return max_height
