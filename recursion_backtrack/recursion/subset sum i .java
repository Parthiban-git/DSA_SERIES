class Solution{
    ArrayList<Integer> res=new ArrayList<>();
    void subset(ArrayList<Integer> list,int index,int sum){
        if(index==list.size()){
            res.add(sum);
            return ;
        }
        subset(list,index+1,sum+list.get(index));
        subset(list,index+1,sum);
    }
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        subset(arr,0,0);
        return res;
    }
}
// Input:
// N = 2
// arr[] = {2, 3}
// Output:
// 0 2 3 5
// Explanation:
// When no elements is taken then Sum = 0.
// When only 2 is taken then Sum = 2.
// When only 3 is taken then Sum = 3.
// When element 2 and 3 are taken then 
// Sum = 2+3 = 5.