class Solution {
    public int maxDepth(String s) {
        
        int count=0;
        int max_count=0;
        int n=s.length();

        for(int i=0;i<n;i++){
            char ch=s.charAt(i);

            if(ch=='('){
                count++;
                max_count=Math.max(count,max_count);
            }
            else if(ch==')'){
                count--;
            }

        }
        return max_count;
    }
}