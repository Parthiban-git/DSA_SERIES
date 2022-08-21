

// Input: s = "][]["
// Output: 1
// Explanation: You can make the string balanced by swapping index 0 with index 3.
// The resulting string is "[[]]".


// Input: s = "]]][[["
// Output: 2
// Explanation: You can do the following to make the string balanced:
// - Swap index 0 with index 4. s = "[]][][".
// - Swap index 1 with index 5. s = "[[][]]".
// The resulting string is "[[][]]".

class Solution {
    public int minSwaps(String s) {
        int close=0,max=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='['){
                close--;
            }
            else close++;
            max=Math.max(close,max);
        }
        return (max+1)/2;
    }
}