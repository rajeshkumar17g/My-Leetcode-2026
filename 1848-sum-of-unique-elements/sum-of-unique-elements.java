class Solution {
    public int sumOfUnique(int[] nums) {
        
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int ele: nums){
            if(map.containsKey(ele)==true){
                int prev_count=map.get(ele);
                map.put(ele,prev_count+1);
            }
            else{
                map.put(ele,1);
            }
        }

        int sum=0;
        for(int key: map.keySet()){
            if(map.get(key)==1){
                sum=sum+key;
            }
        }

        return sum;



    }
}