class Solution {
    public boolean search(char[][] board,int i,int j,String word,int idx){
        int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};
        if(idx==word.length()-1){return true;}
        board[i][j] -= 65;
        for(int d=0;d<4;d++){
            int r = i+dir[d][0];
            int c = j+dir[d][1];
   if(r>=0 && c>=0 && r<board.length && c<board[0].length && board[r][c]==word.charAt(idx+1) && search(board,r,c,word,idx+1)==true){return true;}         
        }
        board[i][j] += 65;
        return false;
    }
    
    public boolean exist(char[][] board, String word) {
        int r = board.length;
        int c = board[0].length;
        for(int i =0;i<r;i++){
            for(int j =0;j<c;j++){
                if(board[i][j] == word.charAt(0) && search(board,i,j,word,0)==true){return true;}
            }
        }
        return false;
    }
}
