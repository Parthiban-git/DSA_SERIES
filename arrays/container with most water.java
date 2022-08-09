class Solution {
    public int maxArea(int[] height) {
        int start=0,end=height.length-1;
        int max_area=Integer.MIN_VALUE;
        while(start<end){
            int area=end-start;
            max_area=Math.max(max_area,area*Math.min(height[start],height[end]));
            if(height[start]<height[end]){
                start++;
            }
            else end--;
        }
        return max_area;
    }
}