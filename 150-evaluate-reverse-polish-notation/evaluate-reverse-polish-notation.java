class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();

        for(int i=0;i<tokens.length;i++){
            String s=tokens[i];

            if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")){
                int pop1=stack.pop();
                int pop2=stack.pop();
                int ans=0;

                if(s.equals("+")){
                    ans=pop2+pop1;
                }
                else if(s.equals("-")){
                    ans=pop2-pop1;
                }
                else if(s.equals("*")){
                    ans=pop2*pop1;
                }
                else if(s.equals("/")){
                    ans=pop2/pop1;
                }
                stack.push(ans);
            }
            else{
                stack.push(Integer.parseInt(s));
            }
        }

        return stack.pop();
    }
}