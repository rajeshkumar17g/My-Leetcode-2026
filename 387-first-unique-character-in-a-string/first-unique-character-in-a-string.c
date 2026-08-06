int firstUniqChar(char* s) {
    
    int arr[26];
    for(int i=0;s[i]!='\0';i++){
        int index=s[i]-97;
        arr[index]++;
    }

    for(int i=0;s[i]!='\0';i++){
        int index=s[i]-97;
        if(arr[index]==1){
            return i;
        }
    }
    
    return -1;
}