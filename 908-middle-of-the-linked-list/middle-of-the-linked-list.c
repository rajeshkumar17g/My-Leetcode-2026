/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };

 int count=0;
    struct ListNode *crr=head;
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
struct ListNode* middleNode(struct ListNode* head) {

    struct ListNode *slow=head, *fast=head;
    while(fast!=NULL && fast->next!=NULL){
        slow=slow->next;
        fast=fast->next;
        fast=fast->next;
    }
    return slow;
}