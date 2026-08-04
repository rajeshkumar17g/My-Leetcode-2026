bool checkIfPangram(char* sentence) {
    char ch='a';
    for(int i=0;i<26;i++){
        char alpha=(ch+i);
        int flag=0;
        for(int index=0;sentence[index]!='\0';index++){
            if(alpha==sentence[index]){
                flag=1;
                break;
            }
        }
        if(flag==0){
            return false;
        }
    }
    return true;
   
}

/*


'0'-'9' : 48-57
'A'-'Z' : 65-90
'a'-'z' : 97-122
' '     : 32

1. Index
2. Values : upper-> lower
3. two pointers
4. hashtable
5. sliding window

*/