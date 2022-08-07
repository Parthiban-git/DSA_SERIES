// simple merge sort 
class Solution{
     static int merge(int nums[],int lower,int mid,int upper){
        int n1=mid-lower+1;
        int n2=upper-mid;
        int L[]=new int[n1];
        int R[]=new int[n2];
        for(int i=0;i<n1;i++){
            L[i]=nums[i+lower];
        }
        for(int i=0;i<n2;i++){
            R[i]=nums[i+mid+1];
        }
        int i=0,j=0,k=lower,count=0;
        while(i<n1 && j<n2){
            if(L[i]<=R[j]){
                nums[k]=L[i];
                i++;
            }
            else{
                nums[k]=R[j];
                j++;
                count+=n1-i; // modification
            }
            k++;
        }
        while(i<n1){
            nums[k++]=L[i++];
        }
        while(j<n2){
            nums[k++]=R[j++];
        }
        return count;
    }
    
    static int mergetree(int nums[],int lower,int upper){
        if(lower>=upper){
            return 0;
        }
        int mid=(lower+upper)/2;
        int l=mergetree(nums,lower,mid);
        int r=mergetree(nums,mid+1,upper);
        int m=merge(nums,lower,mid,upper);
        return l+r+m; // merge sort modified
    }
    
    static long inversionCount(long arr[], long N){
        int a[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            a[i]=(int)arr[i];
        }
        int count=mergetree(a,0,arr.length-1);
        return (long)count;
    }
}