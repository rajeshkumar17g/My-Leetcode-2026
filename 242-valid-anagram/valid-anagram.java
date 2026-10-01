class Solution {
    public boolean isAnagram(String s, String t) {

        HashMap<Character,Integer> map1=new HashMap<>();
        for(int index=0;index<s.length();index++){
            char ch=s.charAt(index);

            if(map1.containsKey(ch)==true){
                int count=map1.get(ch);
                map1.put(ch,count+1);
            }
            else{
                map1.put(ch,1);
            }
        }


         HashMap<Character,Integer> map2=new HashMap<>();
        for(int index=0;index<t.length();index++){
            char ch=t.charAt(index);

            if(map2.containsKey(ch)==true){
                int count=map2.get(ch);
                map2.put(ch,count+1);
            }
            else{
                map2.put(ch,1);
            }
        }


       return map1.equals(map2);

    }
}