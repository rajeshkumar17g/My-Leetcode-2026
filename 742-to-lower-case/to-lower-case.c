char* toLowerCase(char* s) {
    for(int index=0;s[index]!='\0';index++){
        if(s[index]>=65 && s[index]<=90){
            s[index]=s[index]+32;
        }
    }

    return s;
}