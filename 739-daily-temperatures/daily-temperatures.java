class Solution {
    public int[] dailyTemperatures(int[] t) {

        int n=t.length;
        Stack<Integer> stack=new Stack<>();
        int[] res=new int[n];

        for(int i=0;i<n;i++){
            while(stack.isEmpty()==false && t[stack.peek()]<t[i]){
                int idx=stack.pop();
                res[idx]=i-idx;
            }
            stack.push(i);
        }

        return res;
    }
}