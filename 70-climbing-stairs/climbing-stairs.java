class Solution {
    ArrayList<Integer> memo=new ArrayList<>(Arrays.asList(1,2));
    public int climbStairs(int n) {
        if(n<=memo.size()){
            return memo.get(n-1);
        }
        memo.add(climbStairs(n-1)+climbStairs(n-2));
        return memo.get(n-1);
    }
}