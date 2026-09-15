class Solution {
    public int[] twoSum(int[] nums, int target) {
       
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int num1=nums[i];
            int num2=target-num1;

            if(map.containsKey(num2)==true){
                int j=map.get(num2);
                return new int[]{i,j};
            }

            map.put(num1,i);
        }

        return nums;//dummy

    }
}

/*
 for(int row=0;row<nums.length-1;row++){
            for(int col=row+1;col<nums.length;col++){
                if(nums[row]+nums[col]==target){
                    return new int[]{row,col};
                }
            }
          
        }

        return nums;//dummy
*/