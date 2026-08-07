/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* reverseList(struct ListNode* head) {
    struct ListNode *crr=head,*after,*rev_head=NULL;

    while(crr!=NULL){
        after=crr->next;
        crr->next=rev_head;
        rev_head=crr;
        crr=after;
    }

    return rev_head;
}