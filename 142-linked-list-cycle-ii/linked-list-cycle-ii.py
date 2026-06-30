# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
            seen=set()
            crr=head
            while crr!=None:
                if crr in seen:
                    return crr
                seen.add(crr)
                crr=crr.next
                
            return None