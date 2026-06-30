# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def middleNode(self, head: Optional[ListNode]) -> Optional[ListNode]:
        slow=head
        fast=head
        while fast!=None and fast.next!=None:
            slow=slow.next
            fast=fast.next
            fast=fast.next
        return slow


        
        '''
        crr=head
        c=0
        while crr!=None:
            c=c+1
            crr=crr.next

        m=c//2+1

        crr=head
        c=1
        while c<m:
            c=c+1
            crr=crr.next
        return crr'''
