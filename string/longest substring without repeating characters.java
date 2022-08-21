class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set=new HashSet<>();
        int start=0,end=0,max=0;
        while(end<s.length()){
            char ch=s.charAt(end);
            while(set.contains(s.charAt(end)) && start<end){
                set.remove(s.charAt(start++));
            }
            set.add(ch);
            max=Math.max(max,set.size());
            end++;
        }
        return max;
    }
}