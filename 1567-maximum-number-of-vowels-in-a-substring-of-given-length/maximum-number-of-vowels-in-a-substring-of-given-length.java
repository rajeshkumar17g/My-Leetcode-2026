class Solution {
    public int maxVowels(String s, int k) {
        //1st substring (default window)
        int window_sum=0;
        for(int i=0;i<k;i++){
            char ch=s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' ||ch=='o'|| ch=='u'){
                window_sum++;
            }
        }

        int max=window_sum;
        for(int i=k;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' ||ch=='o'|| ch=='u'){
                window_sum++;
            }
            ch=s.charAt(i-k);
             if(ch=='a' || ch=='e' || ch=='i' ||ch=='o'|| ch=='u'){
                window_sum--;
            }
            
            max=Math.max(max,window_sum);

        }

        return max;



    }
}