class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        HashMap<Integer,Integer> map=new HashMap<>();
        Stack<Integer> stack=new Stack<>();

        for(int ele: nums2){

            while(stack.isEmpty()==false && ele>stack.peek()){
                map.put(stack.pop(),ele);
            }

            stack.push(ele);
        }

        while(stack.isEmpty()==false){
             map.put(stack.pop(),-1);
        }

        int[] res=new int[nums1.length];

        for(int i=0;i<nums1.length;i++){
            res[i]=map.get(nums1[i]);
        }

        return res;




    }
}