# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def hasCycle(self, head: Optional[ListNode]) -> bool:
        s=set()
        crr=head
        while(crr!=None):
            if(crr in s):
                return True
            s.add(crr)
            crr=crr.next
        
        return False