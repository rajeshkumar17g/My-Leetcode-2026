# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def isPalindrome(self, head: Optional[ListNode]) -> bool:
        st=""
        crr=head
        while crr!=None:
            st=st+str(crr.val)
            crr=crr.next
        return st==st[::-1]