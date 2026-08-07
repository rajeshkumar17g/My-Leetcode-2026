/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };

 struct ListNode *head,*prev;

    if(l1==NULL){
        return l2;
    }
    else if(l2==NULL){
        return l1;
    }

    if(l1->val<=l2->val){
        head=l1;
        prev=l1;
        l1=l1->next;
    }
    else{
        head=l2;
        prev=l2;
        l2=l2->next;
    }
   
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

    if(l1==NULL){
        prev->next=l2;
    }
    else{
        prev->next=l1;
    }

  return head;
 */
struct ListNode* mergeTwoLists(struct ListNode* l1, struct ListNode* l2) {
    
    struct ListNode dummy;
    struct ListNode *prev;
   
    prev=&dummy;
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

    if(l1==NULL){
        prev->next=l2;
    }
    else{
        prev->next=l1;
    }

  return dummy.next;

}