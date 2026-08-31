struct ListNode* rotateRight(struct ListNode* head, int k) {
    
    if(head==NULL || head->next==NULL){
        return head;
    }
    //1. length
    struct ListNode *crr=head;

    int length=1;
    while(crr->next!=NULL){
        crr=crr->next;
        length++;
    }
    
    //2. k=k%len
    k=k%length;

    //3. tail->head
    crr->next=head;

    //4. 
    int pos=length-k;
    crr=head;
    int count=1;
    while(count<pos){
        crr=crr->next;
        count++;
    }
    //5. 
    head=crr->next;

    //6.
    crr->next=NULL;


    return head;

}