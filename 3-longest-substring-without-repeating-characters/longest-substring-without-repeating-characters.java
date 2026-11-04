class Solution {
    public int lengthOfLongestSubstring(String s) {
        

        int left=0,longest=0;
        HashSet<Character> seen=new HashSet<>();

        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            while(seen.contains(ch)==true){
                seen.remove(s.charAt(left));
                left++;
            }
            seen.add(ch);
            longest=Math.max(longest,seen.size());
        }

        return longest;
    }
}