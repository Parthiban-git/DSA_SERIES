public class Solution
{
public static int findMinimumCoins(int amount){
        int V=amount;
        int coins[]={1, 2, 5, 10, 20, 50, 100, 500, 1000};
        Arrays.sort(coins);
        int count=0,j=coins.length-1;
        while(j>=0){
            if(coins[j]<=V){
                V-=coins[j];
                count++;
                if(V==0){
                    break;
                }
            }
            else{
                j--;
            }
        }
        if(V==0){
            return count;
        }
        return -1;
    }
}
