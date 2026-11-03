class Solution {
    public boolean isvowel(char ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            return true;
        }
        return false;
    }
    public int maxVowels(String s, int k) {

     int vowel_count=0;
     //1st window
     for(int i=0;i<k;i++){
        char ch=s.charAt(i);
        if(isvowel(ch)){
            vowel_count++;
        }
     }


     int max=vowel_count;
     for(int i=k;i<s.length();i++){
        if(isvowel(s.charAt(i))){
            vowel_count++;
        }

        if(isvowel(s.charAt(i-k))){
            vowel_count--;
        }

        max=Math.max(max,vowel_count);
     }

     return max;

    }
}