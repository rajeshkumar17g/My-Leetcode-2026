# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next 
'''
crr=head
         c=0
         while crr!=None:
            c+=1
            crr=crr.next
         middle=c//2+1


         c=1
         crr=head
         while c<middle:
            c+=1
            crr=crr.next
         return crr'''
class Solution:
    def middleNode(self, head: Optional[ListNode]) -> Optional[ListNode]:
         slow=head
         fast=head
         while fast!=None and fast.next!=None:
            slow=slow.next
            fast=fast.next
            fast=fast.next
         return slow




