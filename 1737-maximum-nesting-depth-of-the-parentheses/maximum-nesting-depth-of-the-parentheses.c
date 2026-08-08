int maxDepth(char* s) {
    int c=0,max=0;
    for(int i=0;s[i]!='\0';i++){
        if(s[i]=='('){
            c++;
        }
        else if(s[i]==')'){
            c--;
        }

        if(c>max){
            max=c;
        }
    }
    return max;
}

/*

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
    */