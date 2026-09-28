class Solution {
    public int[] dailyTemperatures(int[] temp) {
        
        Stack<Integer> stack=new Stack<>();
        int[] res=new int[temp.length];

        for(int i=0;i<temp.length;i++){

            while(stack.isEmpty()==false && temp[stack.peek()]<temp[i]){
                int idx=stack.pop();
                res[idx]=i-idx;
            }
            stack.push(i);
        }

        return res;
    }
}