class Solution {

    public boolean isValid(String s) {
        try{
            ArrayList<String> list=new ArrayList<String>();
        String str="";
        for(var i=0;i<s.length()-1;i++){
              if(s.charAt(i)!='.'){
                  str=str+s.charAt(i);
              }
              else if(s.charAt(i)=='.'){
                  list.add(str);
                  str="";
              }
        }
        str="";
        for(var i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!='.'){
                  str=str+s.charAt(i);
              }
             else if(s.charAt(i)=='.'){
                 StringBuffer sb=new StringBuffer(str);
                  list.add(new String(sb.reverse()));
                  str="";
                  break;
              }
        }
        // System.out.println(list);
        for(var i:list){
            char c=i.charAt(0);
            int firval=Integer.parseInt(String.valueOf(c));
            if(firval==0 && i.length()>1){
                return false;
            }
            int val=Integer.parseInt(String.valueOf(i));
            if(val>255 || val<0){
                return false;
            }
        }
            if(list.size()==4){
                return true;
            }
            else{
                return false;
            }
        }
        catch(Exception e){
            return false;
        }
    }
}