
// You are given an array people where people[i] is the weight of the ith person, and an infinite number of boats where each boat can carry a maximum weight of limit. Each boat carries at most two people at the same time, provided the sum of the weight of those people is at most limit.

// Return the minimum number of boats to carry every given person.

 

// Example 1:

// Input: people = [1,2], limit = 3
// Output: 1
// Explanation: 1 boat (1, 2)

class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int minboats=0,low=0,high=people.length-1;
        while(low<=high){
            if(people[low]+people[high]<=limit){
                low++;high--;
            }
            else high--;
            minboats++;
        }
        return minboats;
    }
}