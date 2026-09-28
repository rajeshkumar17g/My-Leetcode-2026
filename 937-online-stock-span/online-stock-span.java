class StockSpanner {
    public Stack<int[]> stack;
    public StockSpanner() {
        stack=new Stack<>();
    }
    
    public int next(int price) {
        int span=1;
        while(stack.isEmpty()==false && stack.peek()[0]<=price){
            int[] last=stack.pop();
            span=span+last[1];
        }

        stack.push(new int[] {price,span});

        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */