class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,Comparator.comparingInt(o->o[0]));
        ArrayList<int[]> list=new ArrayList<>();
        int start=intervals[0][0],end=intervals[0][1];
        for(int i=0;i<intervals.length;i++){
            if(intervals[i][0]<=end){
                end=Math.max(end,intervals[i][1]);
            }
            else{
                list.add(new int[]{start,end});
                start=intervals[i][0];
                end=intervals[i][1];
            }
        }
        list.add(new int[]{start,end});
        return list.toArray(new int[0][]);
    }
}