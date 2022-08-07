class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set=new HashSet<Character>();
        int max=0;
        int start=0,end=0;
        while(end<s.length()){
            char ch=s.charAt(end);
            while(set.contains(ch) && start<=end){
                set.remove(s.charAt(start++));
            }
            set.add(ch);
            max=Math.max(max,set.size());
            end++;
        }            
        return max;
    }
}