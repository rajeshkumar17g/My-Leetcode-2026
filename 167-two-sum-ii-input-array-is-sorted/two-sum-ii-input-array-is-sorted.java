class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int left=0,right=nums.length-1;

        while(left<right){
            if(nums[left]+nums[right]==target){
                return new int[]{left+1,right+1};
            }
            else if(nums[left]+nums[right]<target){
                left++;
            }
            else{
                right--;
            }
        }

        return nums;//dummy
    }
}


/*
HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int num1=nums[i];
            int num2=target-num1;

            if(map.containsKey(num2)==true){
                int j=map.get(num2);
                return new int[]{j+1,i+1};
            }
            map.put(num1,i);//adding in map

        }
        return nums;//dummy
*/