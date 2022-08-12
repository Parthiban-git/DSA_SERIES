class Solution{
    static int findPlatform(int arr[], int dep[], int n){
        Arrays.sort(arr);
        Arrays.sort(dep);
        int platform=1,res=1;
        int i=1,j=0;
        while(i<n && j<n){
            if(arr[i]<=dep[j]){
                platform++;
                i++;
            }
            else{
                platform--;
                j++;
            }
            res=Math.max(res,platform);
        }
        return res;
    }
    
}
