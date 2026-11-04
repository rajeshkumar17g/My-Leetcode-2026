class Solution {
    public int calPoints(String[] s) {
        
        Stack<Integer> st=new Stack<>();

        for(int i=0;i<s.length;i++){
           String ch=s[i];

            if(ch.equals("C")){
                st.pop();
            }
            else if(ch.equals("D")){
                st.push(st.peek()*2);
            }
            else if(ch.equals("+")){
                int p1=st.pop();
                int p2=st.pop();
                st.push(p2);
                st.push(p1);
                st.push(p1+p2);
            }
            else{
                st.push(Integer.parseInt(ch));
            }

        }


        int sum=0;
        while(st.isEmpty()==false){
            sum=sum+st.pop();
        }

        return sum;
    }
}