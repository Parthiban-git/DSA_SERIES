class comparator implements Comparator<Item>{
    public int compare(Item o1,Item o2){
        double x=(double)o1.value/(double)o1.weight;
        double y=(double)o2.value/(double)o2.weight;
        if(x<y) return 1;
        else if(x>y) return -1;
        return 0;
    }
}
class Solution
{
    double fractionalKnapsack(int W, Item arr[], int n) {
         Arrays.sort(arr,new comparator());
         double tot=0.0;
         int currweight=W;
         for(Item obj:arr){
             if(currweight-obj.weight>=0){
                currweight -=obj.weight;
                 tot+=obj.value;
             }
             else{
                tot+=(double)currweight/(double)obj.weight*(double)obj.value;
                break;                 
             }
         }
         return tot;
    }
}

