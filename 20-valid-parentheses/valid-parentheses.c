bool isValid(char* s) {
    char stack[10000];
    int top=-1;

    for(int index=0;s[index]!='\0';index++){
        char ch=s[index];
        if(ch=='(' || ch=='{' || ch=='['){
            top++;
            stack[top]=s[index];
        }
        else{
          if(ch==')' && (top==-1 || stack[top]!='(')){
            return false;
          }  
          else if(ch==']' && (top==-1 || stack[top]!='[')){
            return false;
          }
          else if(ch=='}' && (top==-1 || stack[top]!='{')){
            return false;
          }
          top--;
        }
    }

    if(top==-1)
        return true;
    else
        return false;
}