class Solution {
    public int maxDepth(String s) {
        
        Stack<Character> stack=new Stack<>();
        int count=0,max=0;
        for(int i=0;i<s.length();i++){

            char ch=s.charAt(i);
            if(ch=='('){
                stack.push(ch);
                count++;
            }
            else if(ch==')'){
                stack.pop();
                count--;
            }
            max=Math.max(max,count);
        }
        
        return max;

    }
}