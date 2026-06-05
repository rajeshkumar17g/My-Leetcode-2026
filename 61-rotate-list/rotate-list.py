class Solution:
    def rotateRight(self, head: Optional[ListNode], k: int) -> Optional[ListNode]:

        if head==None or head.next==None or k==0:
            return head
        # 1st step

        crr=head
        length=0
        while crr!=None:
            length+=1
            crr=crr.next

        k=k%length
        

        c=1
        fast=head
        while c<=k:
            c+=1
            fast=fast.next
        
        slow=head
        if fast==None: #length and rotations are same so zero rot
            return head

        while fast.next!=None:
            slow=slow.next
            fast=fast.next

        fast.next=head
        rot_head=slow.next
        slow.next=None


        return rot_head