int getDecimalValue(struct ListNode* head) {
    int ans=0;
    struct ListNode* crr=head;

    while(crr!=NULL){
        ans=ans*2+(crr->val);
        crr=crr->next;
    }

    return ans;
       
}


/*
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
*/