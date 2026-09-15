class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen=new HashSet<>();

        for(int ele: nums){
            if(seen.contains(ele)==true){
                return true;
            }
            seen.add(ele);
        }

        return false;
    }
}