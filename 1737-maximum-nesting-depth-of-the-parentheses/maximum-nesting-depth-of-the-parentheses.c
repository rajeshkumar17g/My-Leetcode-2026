int maxDepth(char* s) {
    char stack[100];
    int top=-1;
    int max=0;
    for(int index=0;s[index]!='\0';index++){
        if(s[index]=='('){
            top++;
            stack[top]='(';
        }
        else if(s[index]==')'){
            top--;
        }

        if(top+1>max){
            max=top+1;
        }
    }
    return max;
}