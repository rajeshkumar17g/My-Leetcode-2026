
struct ListNode* rotateRight(struct ListNode* head, int k) {
    
    if(head==NULL || head->next==NULL){
        return head;
    }
    struct ListNode* crr=head;
    int length=0;
    while(crr!=NULL){
        crr=crr->next;
        length++;
    }
    k=k%length;

    struct ListNode* slow=head,*fast=head;
    int count=0;
    while(count<k){
        count++;
        fast=fast->next;
    }

    while(fast->next!=NULL){
        slow=slow->next;
        fast=fast->next;
    }
    fast->next=head;
    head=slow->next;
    slow->next=NULL;

    return head;
}