# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next 
class Solution:
    def middleNode(self, head: Optional[ListNode]) -> Optional[ListNode]:
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
         return crr