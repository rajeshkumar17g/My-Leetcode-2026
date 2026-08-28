bool isAnagram(char* s, char* t) {
    
    int arr1[26];
    
    for(int index=0;s[index]!='\0';index++){
        int i=s[index]-97;
        arr1[i]++;
    }

    for(int index=0;t[index]!='\0';index++){
        int i=t[index]-97;
        arr1[i]--;
    }

    for(int i=0;i<26;i++){
        if(arr1[i]!=0){
            return false;
        }
    }

    return true;
}

/*

1. Create an arr1 of size 26
2. access all the char of string1 => arr1[index]







for(int i=0;s[i]!='\0';i++){
        int flag=0;
        for(int j=0;t[j]!='\0';j++){
            if(s[i]==t[j]){
                flag=1;
                break;
            }
        }
        if(flag==0){
            return false;
        }
    }

    return true;
*/