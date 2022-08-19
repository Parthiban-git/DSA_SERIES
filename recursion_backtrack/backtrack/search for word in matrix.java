class Solution {
    boolean wordsearch(int i,int j,char board[][],String word,int index){
        if(index==word.length()) return true;
        if(i<0 || j<0 || i>=board.length || j>=board[0].length || board[i][j]!=word.charAt(index)){
            return false;
        }
        char ch=board[i][j];
        board[i][j]='*';
        boolean left=wordsearch(i,j-1,board,word,index+1);
        boolean right=wordsearch(i,j+1,board,word,index+1);
        boolean down=wordsearch(i-1,j,board,word,index+1);
        boolean up=wordsearch(i+1,j,board,word,index+1);
        board[i][j]=ch;
        return left || right || down || up;
    }
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0)){
                    boolean b=wordsearch(i,j,board,word,0);
                    if(b==true) return true;
                }
            }
        }
        return false;
    }
}