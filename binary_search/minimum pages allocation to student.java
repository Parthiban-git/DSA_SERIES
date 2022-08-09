class Solution 
{
    static boolean allocationpossible(int mid,int m,int arr[]){
        int studentCount=1;
      int pageSum=0,n=arr.length;
      
      for(int i=0; i<n; i++){
          if(pageSum + arr[i] <= mid){
              pageSum+=arr[i];
          }
          else{
              studentCount++;
              if(studentCount>m || arr[i]>mid){
                  return false;
              }
              pageSum= arr[i];
          }
      }
      return true;
    }
    
    public static int findPages(int[]A,int N,int M){
        int low=Integer.MAX_VALUE,high=0;
        for(int i:A){
            low=Math.min(low,i);
            high+=i;
        }
        int minimumpages=0;
        while(low<=high){
            int mid=(low+high)/2;
            if(allocationpossible(mid,M,A)==true){
                minimumpages=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return minimumpages;
    }
};