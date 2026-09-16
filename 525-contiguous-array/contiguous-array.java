class Solution {
    public int findMaxLength(int[] nums) {
        
        int n=nums.length;
        int[] prefix=new int[n];
        if(nums[0]==0){
            prefix[0]=-1;
        }
        else{
            prefix[0]=1;
        }

        for(int i=1;i<n;i++){
            int val=(nums[i]==0)?-1:1;
            prefix[i]=prefix[i-1]+val;
        }

        HashMap<Integer,Integer> map=new HashMap<>();
        int max=0;
        for(int i=0;i<n;i++){
            if(prefix[i]==0){
                max=Math.max(max,i+1);
            }
            if(map.containsKey(prefix[i])==true){
                max=Math.max(max,i-map.get(prefix[i]));
            }
            else{
                map.put(prefix[i],i);
            }
        }

        return max;
    }
}