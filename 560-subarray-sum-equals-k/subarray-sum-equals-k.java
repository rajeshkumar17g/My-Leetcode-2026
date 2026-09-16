class Solution {
    public int subarraySum(int[] nums, int k) {

        int n=nums.length;
        int[] prefix=new int[n];
        prefix[0]=nums[0];
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+nums[i];
        }

        int count=0;
        HashMap<Integer,Integer> map=new HashMap<>();

        prefix[0]=nums[0];
        map.put(prefix[0],1);
        if(prefix[0]==k){
            count++;
        }

        for(int i=1;i<n;i++){
            if(prefix[i]==k){
                count++;
            }
            int val=prefix[i]-k;
            if(map.containsKey(val)==true){
                count=count+map.get(val);
            }

            if(map.containsKey(prefix[i])==true){
                map.put(prefix[i],map.get(prefix[i])+1);
            }
            else{
                map.put(prefix[i],1);
            }  
        }
       
        System.out.print(map);
        return count;
    }
}