class Solution{
    int tour(int petrol[], int distance[]){
        int remainingfuel=0,start=0,tot=0,i=0;
        while(i<petrol.length){
            remainingfuel+=petrol[i]-distance[i];
            tot+=petrol[i]-distance[i];
            if(remainingfuel<0){
                start=i+1;
                remainingfuel=0;
            }
            i++;
        }
        return tot<0?-1:start;
    }
}

// Suppose there is a circle. There are N petrol pumps on that circle. You will be given two sets of data.
// 1. The amount of petrol that every petrol pump has.
// 2. Distance from that petrol pump to the next petrol pump.
// Find a starting point where the truck can start to get through the complete circle without exhausting its petrol in between.
// Note :  Assume for 1 litre petrol, the truck can go 1 unit of distance.

// Example 1:

// Input:
// N = 4
// Petrol = 4 6 7 4
// Distance = 6 5 3 5
// Output: 1