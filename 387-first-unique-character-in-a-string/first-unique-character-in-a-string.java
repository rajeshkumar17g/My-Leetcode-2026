class Solution {
    public int firstUniqChar(String s) {
        
        HashMap<Character,Integer> map=new HashMap<>();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(map.containsKey(ch)==true){
                int prev_count=map.get(ch);
                map.put(ch,prev_count+1);
            }
            else{
                map.put(ch,1);
            }
        }

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(map.get(ch)==1){
                return i;
            }
        }

        return -1;


    }
}