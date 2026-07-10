class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map1=new HashMap<>();
        HashMap<Character,Character> map2=new HashMap<>();
        for(int index=0;index<s.length();index++){
            if(map1.containsKey(s.charAt(index))){
                if(map1.get(s.charAt(index))!=t.charAt(index)){
                    return false;
                }
            }
            else{
                map1.put(s.charAt(index),t.charAt(index));
            }

            if(map2.containsKey(t.charAt(index))){
                if(map2.get(t.charAt(index))!=s.charAt(index)){
                    return false;
                }
            }
            else{
                map2.put(t.charAt(index),s.charAt(index));
            }
        }
        return true;
    }
}