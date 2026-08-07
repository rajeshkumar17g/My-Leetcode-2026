int getDecimalValue(struct ListNode* head) {

        int len=0;
        struct ListNode* crr=head;

        while(crr!=NULL){
            len++;
            crr=crr->next;
        }

        int p=len-1;
        int sum=0;
        crr=head;
        while(crr!=NULL){
            sum=sum+(crr->val*pow(2,p));
            crr=crr->next;
            p--;
        }
        return sum;
}