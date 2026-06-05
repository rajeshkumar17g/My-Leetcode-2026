# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def mergeTwoLists(self, list1: Optional[ListNode], list2: Optional[ListNode]) -> Optional[ListNode]:
        dummy=ListNode()

        prev=dummy
        while list1!=None and list2!=None:
            if list1.val<=list2.val:
                prev.next=list1
                prev=list1
                list1=list1.next
            else:
                prev.next=list2
                prev=list2
                list2=list2.next
        
        if list1!=None:
            prev.next=list1
        else:
            prev.next=list2

        return dummy.next