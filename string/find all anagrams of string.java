
// Given two strings s and p, return an array of all the start indices of p's anagrams in s. You may return the answer in any order.

// An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

 

// Example 1:

// Input: s = "cbaebabacd", p = "abc"
// Output: [0,6]
// Explanation:
// The substring with start index = 0 is "cba", which is an anagram of "abc".
// The substring with start index = 6 is "bac", which is an anagram of "abc"


class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int phash[]=new int[26];
        int shash[]=new int[26];
        for(int i=0;i<p.length();i++){
            phash[p.charAt(i)-'a']++;
        }
        int k=p.length();
        List<Integer> res=new <Integer>ArrayList();
        int start=0,end=0;
        while(end<s.length()){
            shash[s.charAt(end)-'a']++;
            while(end-start+1>k && start<=end){
                shash[s.charAt(start)-'a']--;
                start++;
            }
            if(end-start+1==k){
                if(Arrays.equals(phash,shash)){
                    res.add(start);
                }
            }
            end++;
        }
        return res;
    }
}