
struct ListNode* reverseList(struct ListNode* head) {
    struct ListNode* rev_head=NULL,*after,*crr=head;

    while(crr!=NULL){
        after=crr->next;
        crr->next=rev_head;
        rev_head=crr;
        crr=after;
    }

    return rev_head;
}