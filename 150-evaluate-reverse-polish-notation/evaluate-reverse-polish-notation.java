class Solution {
    public int evalRPN(String[] tokens) {

        Stack<Integer> stack=new Stack<>();
        int pop1,pop2,res;

        for(String ch: tokens){
            if(ch.equals("+")){
               pop1=stack.pop();
               pop2=stack.pop();
               res=pop2+pop1;
            }
            else if(ch.equals("-")){
               pop1=stack.pop();
               pop2=stack.pop();
               res=pop2-pop1;
            }
            else if(ch.equals("*")){
               pop1=stack.pop();
               pop2=stack.pop();
               res=pop2*pop1;
            }
            else if(ch.equals("/")){
               pop1=stack.pop();
               pop2=stack.pop();
               res=pop2/pop1;
            }
            else{
                res=Integer.parseInt(ch);
            }
            stack.push(res);
        }
        return stack.pop();
    }
}