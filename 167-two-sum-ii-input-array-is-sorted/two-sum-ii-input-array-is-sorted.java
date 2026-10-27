class Solution {
    public int[] twoSum(int[] nums, int target) {
        
      HashMap<Integer,Integer> map=new HashMap<>();  //{key:value}

      for(int i=0;i<nums.length;i++){

        int num1=nums[i];
        int num2=target-num1;

        if(map.containsKey(num2)==true){
            int j=map.get(num2);
            return new int[]{j+1,i+1};
        }
        map.put(num1,i);  // value : index

      }  

      return nums;//dummy
    }
}