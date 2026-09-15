class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);

        int left=0,right=people.length-1,boat=0;

        while(left<=right){
            if(people[left]+people[right]<=limit){
                left++;
                right--;
                boat++;
            }
            else{
                right--;
                boat++;
            }
        }

        return boat;
    }
}