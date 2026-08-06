char* toLowerCase(char* s) {
    for(int index=0;s[index]!='\0';index++){
        if(s[index]>='A' && s[index]<='Z'){
            s[index]=s[index]+32;
        }
    }

    return s;
}