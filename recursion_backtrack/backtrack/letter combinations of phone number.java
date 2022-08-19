class Solution {
    Map<Integer,String> map=new HashMap<>();
    void combinations(int n,String ans,List<String> res){
        if(n==0){
            res.add(new StringBuffer(ans).reverse().toString());
            return ;
        }
        int r=n%10;
        String s=map.get(r);
        for(int i=0;i<s.length();i++){
            combinations(n/10,ans+s.charAt(i),res);
        }
    }
    public List<String> letterCombinations(String digits) {
        List<String> res=new ArrayList<>(); 
        if(digits.length()==0) return res;
        for(int i=2;i<=9;i++){
            switch(i){
                case 2:
                    map.put(i,"abc");break;
                case 3:
                    map.put(i,"def");break;
                case 4:
                    map.put(i,"ghi");break;
                case 5:
                    map.put(i,"jkl");break;
                case 6:
                    map.put(i,"mno");break;
                case 7:
                    map.put(i,"pqrs");break;
                case 8:
                    map.put(i,"tuv");break;
                case 9:
                    map.put(i,"wxyz");break;
        }
    }
        combinations(Integer.parseInt(digits),"",res);
        return res;
    }
}