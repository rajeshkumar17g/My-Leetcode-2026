/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* mergeTwoLists(struct ListNode* l1, struct ListNode* l2) {
    
    struct ListNode dummy;

    struct ListNode* prev=&dummy;

    while(l1!=NULL && l2!=NULL){

        if(l1->val<=l2->val){
            prev->next=l1;
            l1=l1->next;
            prev=prev->next;
        }
        else{
            prev->next=l2;
            l2=l2->next;
            prev=prev->next;
        }
    }

    if(l1!=NULL){
        prev->next=l1;
    }
    else{
        prev->next=l2;
    }

    return dummy.next;

}