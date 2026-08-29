bool canConstruct(char* s1, char* s2) {
    int arr1[26];

    for(int i=0;s1[i]!='\0';i++){
        int index=s1[i]-97;
        arr1[index]++;
    }


    int arr2[26];

    for(int i=0;s2[i]!='\0';i++){
        int index=s2[i]-97;
        arr2[index]++;
    }

    for(int i=0;i<26;i++){
        if(arr1[i]>arr2[i]){
            return false;
        }
    }
    return true;
}