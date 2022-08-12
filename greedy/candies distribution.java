class Solution {
    public int candy(int[] ratings) {
        int left[]=new int[ratings.length];
        int right[]=new int[ratings.length];
        Arrays.fill(left,1);
        Arrays.fill(right,1);
        
        for(int i=0;i<ratings.length-1;i++){
            if(ratings[i]<ratings[i+1]){
                left[i+1]=left[i]+1;
            }
        }
        for(int i=ratings.length-1;i>0;i--){
            if(ratings[i]<ratings[i-1]){
                right[i-1]=right[i]+1;
            }
        }
        int mincandies=0;
        for(int i=0;i<ratings.length;i++){
            mincandies+=Math.max(left[i],right[i]);
        }
        return mincandies;
    }
}



// There are n children standing in a line. Each child is assigned a rating value given in the integer array ratings.

// You are giving candies to these children subjected to the following requirements:

// Each child must have at least one candy.
// Children with a higher rating get more candies than their neighbors.
// Return the minimum number of candies you need to have to distribute the candies to the children.

 

// Example 1:

// Input: ratings = [1,0,2]
// Output: 5
// Explanation: You can allocate to the first, second and third child with 2, 1, 2 candies respectively.