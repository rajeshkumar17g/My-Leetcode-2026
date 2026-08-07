struct ListNode* removeNthFromEnd(struct ListNode* head, int n) {
    struct ListNode *fast=head,*slow=head;

    int count=0;
    while(count<n){
        fast=fast->next;
        count++;
    }
    if(fast==NULL){
        return head->next;
    }

    while(fast->next!=NULL){
        slow=slow->next;
        fast=fast->next;
    }

    slow->next=slow->next->next;

    return head;
}