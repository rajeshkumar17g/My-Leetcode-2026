class Solution {
    public int subarraySum(int[] nums, int k) {

       int[] prefix=new int[nums.length+1];
       

       for(int i=1;i<=nums.length;i++){
          prefix[i]=prefix[i-1]+nums[i-1];
       }

       HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;

       for(int i=0;i<prefix.length;i++){
           int total=prefix[i];

           int comp=total-k;
           if(map.containsKey(comp)==true){
              //System.out.println("("+i+","+map.get(comp)+")");
              count=count+map.get(comp);
           }
           map.put(total,map.getOrDefault(total,0)+1);
       }
       return count;
    }
}