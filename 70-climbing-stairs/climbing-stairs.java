class Solution {
    ArrayList<Integer> dp;
    public int fib(int n){
        if(n<dp.size()){
            return dp.get(n);
        }
        dp.add(fib(n-1)+fib(n-2));
        return dp.get(n);
    }
    
    public int climbStairs(int n) {
        dp=new ArrayList<>();
        dp.add(1); // dp=[1,1]
        dp.add(1);
        return fib(n);
    }
}