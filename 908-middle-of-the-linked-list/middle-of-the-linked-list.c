/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* middleNode(struct ListNode* head) {
    
    struct ListNode *slow=head,*fast=head;

    while(fast!=NULL && fast->next!=NULL){

        slow=slow->next;
        fast=fast->next;
        fast=fast->next;

    } 
    return slow;
  
}


/*
  struct ListNode* crr=head;
    int count=0;

    while(crr!=NULL){
        count++;
        crr=crr->next;
    }
    int mid=count/2+1;

    crr=head;
    count=1;
    while(count<mid){
        count++;
        crr=crr->next;
    }
    return crr;
*/