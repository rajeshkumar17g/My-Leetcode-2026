class Solution {
    public int removeDuplicates(int[] nums) {
        
        int prev=0,crr=0,last=Integer.MIN_VALUE,count=0;

        while(crr<nums.length){
            if(nums[crr]==last){
                count++;
            }
            else{
                last=nums[crr];
                count=1;
            }

            if(count<=2){
                nums[prev]=nums[crr];
                prev++;
            }
            crr++;
        }
        return prev;
    }
}