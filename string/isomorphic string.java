class Solution {
    Map<Character,Character> map1=new HashMap<Character,Character>();
    Map<Character,Character> map2=new HashMap<Character,Character>();
    
    boolean isIsomorphic(String s,String t,int i,int j){
        if(!map1.containsKey(s.charAt(i))) map1.put(s.charAt(i),t.charAt(j));
        else{
            if(map1.get(s.charAt(i))!=t.charAt(j)) return false;
        }
        if(!map2.containsKey(t.charAt(j))) map2.put(t.charAt(j),s.charAt(i));
        else{
            if(map2.get(t.charAt(j))!=s.charAt(i)) return false;
        }
        return true;        
    }
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()) return false;
        int i=0,j=0;
        while(i<s.length() && j<t.length()){
            boolean check=isIso(s,t,i,j);
            if(check==false) return false;
            i++;j++;
        }
        return true;
    }
}