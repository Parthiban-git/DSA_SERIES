class Solution {
    public int numMatchingSubseq(String s, String[] words) {
        int matchingsubsequence=0;
        for(int i=0;i<words.length;i++){
            int j=0,k=0;
            String res=words[i];int count=0;
            while(j<res.length() && k<s.length()){
                if(res.charAt(j)==s.charAt(k)){
                    k++;j++;count++;
                }
                else k++;
            }
            if(count==res.length()) matchingsubsequence++;          
            
        }
        return matchingsubsequence;
    }
}
// two pointer approach
// Input: s = "abcde", words = ["a","bb","acd","ace"]
// Output: 3
// Explanation: There are three strings in words that are a subsequence of s: "a", "acd", "ace".
