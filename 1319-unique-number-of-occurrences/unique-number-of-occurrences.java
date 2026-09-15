class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int ele: arr){
            if(map.containsKey(ele)==true){
                map.put(ele,map.get(ele)+1);
            }
            else{
                map.put(ele,1);
            }
        }
        HashSet<Integer> seen=new HashSet<>();
        for(int val: map.values()){
          
            if(seen.contains(val)==true){
                return false;
            }
            seen.add(val);
        }

        return true;
        
    }
}