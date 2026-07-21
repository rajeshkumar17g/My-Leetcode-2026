# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def getDecimalValue(self, head: Optional[ListNode]) -> int:
        crr=head
        s=""
        while crr!=None:
            s=s+str(crr.val)
            crr=crr.next
        return int(s,2)