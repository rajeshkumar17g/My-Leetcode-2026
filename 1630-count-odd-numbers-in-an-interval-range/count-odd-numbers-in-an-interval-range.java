class Solution {
    public int countOdds(int low, int high) {

        if(low%2==1 || high%2==1){
            return (high-low)/2+1;
        }
        return (high-low)/2;

    }
}
/*
 int o = 0;
        for (int i = low; i <= high; i++) {
            if (i % 2 != 0) {
                o++;
            }
        }
        return o;
*/