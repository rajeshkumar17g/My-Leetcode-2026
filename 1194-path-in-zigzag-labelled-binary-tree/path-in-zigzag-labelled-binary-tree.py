class Solution:
    def pathInZigZagTree(self, label: int) -> List[int]:
        level = 0
        while ((1 << (level+1))-1 )< label:
            level += 1
        
        path = []
        while label >= 1:
            path.append(label)
            level_max = (1 << (level+1)) - 1
            level_min = (1 << (level))

            label = (level_max + level_min - label) // 2
            level -= 1

        return path[::-1]