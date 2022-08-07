class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        List<Integer> list=new ArrayList<Integer>();
        
        for(int i=0;i<numRows;i++){
            list=new ArrayList<>(i+1);
            for(int k=0;k<i+1;k++){
                list.add(1);
            }
            for(int j=1;j<i;j++){
                int val=res.get(i-1).get(j)+res.get(i-1).get(j-1);
                list.set(j,val);
            }
            res.add(list);
        }
        return res;
    }
}