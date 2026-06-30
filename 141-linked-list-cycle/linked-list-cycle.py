# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def hasCycle(self, head: Optional[ListNode]) -> bool:
        crr=head
        seen=set()
        while crr!=None:
            if crr in seen:
                return True
            seen.add(crr)
            crr=crr.next
        return False