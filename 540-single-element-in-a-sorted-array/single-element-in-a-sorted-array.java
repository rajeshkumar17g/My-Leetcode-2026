class Solution {
    public int singleNonDuplicate(int[] nums) {
        int sum=0;
        for(int num: nums){
            sum=sum^num;
        }
        return sum;
    }
}