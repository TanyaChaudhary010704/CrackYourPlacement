package Backtracking;
import java.util.List;
import java.util.ArrayList;
public class NQueens {

  public boolean isSafe(char[][] board,int n, int row, int col) {
      //vertically up
      for (int i = row - 1; i >= 0; i--) {
        if (board[i][col] == 'Q') {
          return false;
        }
      }
      //diagonally left up
      for (int i = row - 1,j=col-1; i >= 0 && j>=0; i--,j--) {
        if (board[i][j] == 'Q') {
          return false;
        }
      }
      //diagonally right up
      for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
        if (board[i][j] == 'Q') {
          return false;
        }
      }
      return true;
 }
  
  public List<String> construct(char[][] board){
      List<String> rowadd = new ArrayList<>();
      for(int i =0;i<board.length;i++){
          String row = new String(board[i]);
          rowadd.add(row);
      }
      return rowadd;
  }
  
  public void solve(List<List<String>> ans,char[][] board,int n ,int row){
      if(row == n){
          ans.add(construct(board));
          return;
      }

      for(int col = 0;col<n;col++){
          if(isSafe(board,n,row,col)){
              board[row][col] = 'Q';
              solve(ans,board,n,row+1);
              board[row][col] = '.';
          }
      }
  }
  
  public List<List<String>> solveNQueens(int n) {
      List<List<String>> ans = new ArrayList<>();
      char[][] board = new char[n][n];
      for (int i = 0; i < n; i++) {
          for (int j = 0; j < n; j++) {
              board[i][j] = '.';
          }
      }
      solve(ans,board,n,0);
      return ans;
  }
}
