class Solution {
    public int singleNonDuplicate(int[] nums) {
        int sum=0;
        for(int ele: nums){
            sum=sum^ele;
        }
        return sum;
    }
}