class Solution:
    def isPalindrome(self, head: Optional[ListNode]) -> bool:
        crr=head
        nums=[]
        while crr!=None:
            nums.append(crr.val)
            crr=crr.next
        return nums==nums[::-1]