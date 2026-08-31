bool isPalindrome(struct ListNode* head) {
    struct ListNode* slow=head,*fast=head;

    while(fast!=NULL && fast->next!=NULL){
        slow=slow->next;
        fast=fast->next->next;
    }
  
    struct ListNode* crr=head,*rev_head=NULL,*after;

    while(crr!=slow){
        after=crr->next;
        crr->next=rev_head;
        rev_head=crr;
        crr=after;
    }

    if(fast!=NULL){
        slow=slow->next;
    }

    struct ListNode *crr1=rev_head,*crr2=slow;

    while(crr1!=NULL && crr2!=NULL){
        if(crr1->val!=crr2->val){
            return false;
        }
        crr1=crr1->next;
        crr2=crr2->next;
    }

    return true;
}