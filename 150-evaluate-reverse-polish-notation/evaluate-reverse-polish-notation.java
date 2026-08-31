class Solution {
    public int evalRPN(String[] tokens) {
        
        Stack<Integer> stack=new Stack<>();

        for(String ch: tokens){
            int res=0;
            if(ch.equals("+")==true){
                int num1=stack.pop();
                int num2=stack.pop();
                res=num2+num1;
            }
            else if(ch.equals("-")==true){
                int num1=stack.pop();
                int num2=stack.pop();
                res=num2-num1;
            }
            else if(ch.equals("*")==true){
                int num1=stack.pop();
                int num2=stack.pop();
                res=num2*num1;
            }
            else if(ch.equals("/")==true){
                int num1=stack.pop();
                int num2=stack.pop();
                res=num2/num1;
            }
           else{
             res=Integer.parseInt(ch);
           }

           stack.push(res);
            } 



            return stack.pop();



        
    }
}