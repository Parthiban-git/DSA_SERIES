public class Main
{
    static List<String> res=new ArrayList<>();
    
    static void perm(String s,String per){
        if(s.length()==0){
            res.add(per);
            return ;
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            String cs=s.substring(0,i)+s.substring(i+1);
            perm(cs,per+ch);
        }
    }
    
	public static void main(String[] args) {
	     perm("abc","");
	     System.out.println(res);
	}
}
