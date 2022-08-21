// A pangram is a sentence where every letter of the English alphabet appears at least once.

// Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.

class Solution {
    public boolean checkIfPangram(String sentence) {
        int ch[]=new int[26];
        for(int i=0;i<sentence.length();i++){
            ch[sentence.charAt(i)-'a']++;
        }
        for(int i:ch) if(i==0) return false;
        return true;
    }
}