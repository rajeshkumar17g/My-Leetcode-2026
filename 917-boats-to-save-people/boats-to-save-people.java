class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);

        int left=0,right=people.length-1;

        int bcount=0;

        while(left<=right){
            if(people[left]+people[right]<=limit){
                bcount++;
                left++;
                right--;
            }
            else{
                bcount++;
                right--;
            }
        }
        return bcount;
    }
}