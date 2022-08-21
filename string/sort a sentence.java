
// Input: s = "is2 sentence4 This1 a3"
// Output: "This is a sentence"
// Explanation: Sort the words in s to their original positions "This1 is2 a3 sentence4", then remove the numbers.


/// brute n and logn for sort
class Solution {
    public String sortSentence(String s) {
        TreeMap<Integer,String> map=new TreeMap<>();
        boolean space=false;
        String res="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == ' '){
                map.put(Integer.parseInt(res.charAt(res.length()-1)+""),res.substring(0,res.length()-1).trim());
                res="";
                space=true;
            }
            res+=s.charAt(i);
        }
        if(space==false) return s.substring(0,s.length()-1);
        res="";
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i) == ' '){
                res=new StringBuilder(res).reverse().toString();
                map.put(Integer.parseInt(res.charAt(res.length()-1)+""),res.substring(0,res.length()-1).trim());
                res="";
                break;
            }
            res+=s.charAt(i);
        }
        res="";
        for(Map.Entry entry:map.entrySet()){
            res=res+entry.getValue()+" ";
        }
        return res.substring(0,res.length()-1);
        
    }
}

// optimal o(n)  using ascii

class Solution { 
    int ascii(char ch){
        int res=ch;
        return res;
    }
    public String sortSentence(String s) {
        ArrayList<String> list=new ArrayList<>();
        String word="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int asciival=ascii(ch);
            if(asciival>=48 && asciival<=57){
                list.add(word);
                word="";
                i++;
                continue;
            }
            word+=s.charAt(i);
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int asciival=ascii(ch);
            if(asciival>=48 && asciival<=57){
                list.set(Math.abs(asciival-49),word);
                word="";
                i++;
                continue;
            }
            word+=s.charAt(i);
        }
        word="";
        for(int i=0;i<list.size();i++){
            word=word+list.get(i)+" ";
        }
        return word.substring(0,word.length()-1);        
    }
}



