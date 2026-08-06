/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* middleNode(struct ListNode* head) {
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
}