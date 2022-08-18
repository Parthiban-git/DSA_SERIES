class Solution {
    
    public boolean ispalindrome(String s,int start,int end){
        while(start<=end){
            if(s.charAt(start++)!=s.charAt(end--)){
                return false;
            }
        }
        return true;
    }
public void partition(int index,String s,List<String> list,List<List<String>> res){
        if(index==s.length()){
            res.add(new ArrayList<>(list));
            return ;
        }
        for(int i=index;i<s.length();i++){
            if(ispalindrome(s,index,i)){
                list.add(s.substring(index,i+1));
                partition(i+1,s,list,res);
                list.remove(list.size()-1);
            }
        }
    }
    
    public List<List<String>> partition(String s) {
        List<List<String>> res=new ArrayList<List<String>>();
        List<String> list=new ArrayList<String>();
        partition(0,s,list,res);
        return res;
    }
}