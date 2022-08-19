class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> set=new HashSet<>();
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                if(board[i][j]!='.'){
                    if(
                        (set.add(board[i][j]+""+"present in row "+i)==false) ||
                        (set.add(board[i][j]+""+"present in col"+j)==false) ||
                        (set.add(board[i][j]+""+"present in sub"+i/3+"-"+j/3)==false)
                    ){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}