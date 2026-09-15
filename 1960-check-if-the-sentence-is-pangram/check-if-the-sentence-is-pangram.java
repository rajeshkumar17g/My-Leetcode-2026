class Solution {
    public boolean checkIfPangram(String s) {
        HashSet<Character> seen=new HashSet<>();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            seen.add(ch);
        }

        return seen.size()==26;
    }
}