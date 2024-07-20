package Arrays;
import java.util.ArrayList;
public class SpiralMatrix {
  public static void main(String[] args) {
    int nums[][] = { {1,1,1},{1,0,1},{1,1,1}};
    Solution s = new Solution();
    ArrayList<Integer> ans = s.spiralOrder(nums);
    for (int i = 0; i < ans.size(); i++) {
      System.out.print(ans.get(i)+" ");
    }
  }
}
class Solution {
  public ArrayList<Integer> spiralOrder(int[][] matrix) {
      int n = matrix.length;
      int m = matrix[0].length;
      ArrayList<Integer> result = new ArrayList<>();
      
      int startRow =0 , startCol =0 , endRow =n-1,endCol =m-1;
      while(startRow<=endRow && startCol<=endCol){
        //left to right
        for(int j=startCol;j<=endCol;j++){
          result.add(matrix[startRow][j]);
        }
        //top to bottom
        for(int i=startRow+1;i<=endRow;i++){
          result.add(matrix[i][endCol]);
        }
        //right to left
        for(int j=endCol-1;j>=startCol;j--){
          if(startRow==endRow){
            break;
          }  
          result.add(matrix[endRow][j]);
          
        }
        //bottom to top
        for(int i=endRow-1;i>=startRow+1;i--){
          if(startCol==endCol){
            break;
          }  
          result.add(matrix[i][startCol]);
          
        }
        startRow++;
        endRow--;
        startCol++;
        endCol--;
      }
      return result;
  }
}
