class Solution {
    public int trap(int[] height) {
        int low=0,high=height.length-1;
        int leftmax=0,rightmax=0,res=0;
        while(low<=high){
            if(height[low]<=height[high]){
                if(height[low]>=leftmax){
                     leftmax=height[low];
                 }
                else{
                    res+=leftmax-height[low];
                }
                low++;
            }
            else{
                if(height[high]>=rightmax){
                     rightmax=height[high];
                 }
                else{
                    res+=rightmax-height[high];
                }
                high--;
            }
        }
        return res; 
    }
}


// brute method below

class Solution {
    public int trap(int[] height) {
        int sum=0;
        for(int i=0;i<height.length;i++){
            int left=height[i];
            for(int j=0;j<i;j++){
                left=Math.max(left,height[j]);
            }
            int right=height[i];
            for(int j=i+1;j<height.length;j++){
                right=Math.max(right,height[j]);
            }
            sum=sum+((Math.min(left,right))-height[i]);
        }
        return sum;
    }
}