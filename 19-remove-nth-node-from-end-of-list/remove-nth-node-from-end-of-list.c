/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };

 1. move fast pointer n steps
 2. slow=head
 3. move both slow & fast pointer 1 step => fast.next!=null
 4. slow.next=slow.next.next
 */
struct ListNode* removeNthFromEnd(struct ListNode* head, int n) {
    
    struct ListNode *fast=head;
    int count=1;

    while(count<=n){
        fast=fast->next;
        count++;
    }
    if(fast==NULL){
        return head->next;
    }
    struct ListNode *slow=head;
    while(fast->next!=NULL){
        slow=slow->next;
        fast=fast->next;
    }

    slow->next=slow->next->next;

    return head;
}
















