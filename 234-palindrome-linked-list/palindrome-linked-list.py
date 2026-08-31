# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def isPalindrome(self, head: Optional[ListNode]) -> bool:

        s=""
        crr=head
        while crr!=None:
            s=s+str(crr.val)
            crr=crr.next
        return s==s[::-1]