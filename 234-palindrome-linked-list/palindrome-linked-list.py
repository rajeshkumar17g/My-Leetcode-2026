# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def isPalindrome(self, head: Optional[ListNode]) -> bool:
        crr=head
        s=""
        while crr!=None:
            s=s+str(crr.val)
            crr=crr.next
        return s==s[::-1]




        '''
        slow=fast=head
        while fast!=None and fast.next!=None:
            slow=slow.next
            fast=fast.next.next
        
        crr=head
        rev_head=None
        while crr!=slow:
            after=crr.next
            crr.next=rev_head
            rev_head=crr
            crr=after
        


        if fast!=None:
            slow=slow.next
        

        crr1=slow
        crr2=rev_head
        while crr1!=None and crr2!=None:
            if crr1.val!=crr2.val:
                return False
            crr1=crr1.next
            crr2=crr2.next
        return True
        


'''