class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        HashMap<Integer,Integer> map=new HashMap<>();
        Stack<Integer> stack=new Stack<>();


        for(int num: nums2){
            while(stack.isEmpty()==false && num>stack.peek()){
                map.put(stack.pop(),num);
            }
            stack.push(num);
        }

        while(stack.isEmpty()==false){
            map.put(stack.pop(),-1);
        }

        int[] res=new int[nums1.length];
        int index=0;
        for(int num: nums1){
            res[index]=map.get(num);
            index++;
        }

        return res;


    }
}