# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def deleteDuplicates(self, head: Optional[ListNode]) -> Optional[ListNode]:

        dummy=ListNode()
        dummy.next=head

        prev=dummy
        crr=head
        while crr!=None and crr.next!=None:
            if crr.val==crr.next.val:
                while crr.next!=None and crr.val==crr.next.val:
                    crr=crr.next
                crr=crr.next
                prev.next=crr
            else:
                prev=crr
                crr=crr.next
        prev.next=crr

        return dummy.next














