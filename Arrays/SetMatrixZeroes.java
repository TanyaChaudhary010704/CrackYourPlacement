package Arrays;
class Solution {
  public void setZeroes(int[][] matrix) {
      int n = matrix.length;
      int m =  matrix[0].length;
      boolean r0 =false ,c0=false;
      
      for(int i=0;i<n;i++){
          for(int j=0;j<m;j++){
              if(matrix[i][j]==0){
                  if(i==0) r0=true;
                  if(j==0) c0=true;
                  matrix[i][0] = 0;
                  matrix[0][j] = 0;
              }
          }
      }
      
      for(int i=1;i<n;i++){
          for(int j=1;j<m;j++){
              if(matrix[0][j]==0 || matrix[i][0]==0){
                  matrix[i][j]=0;
              }
          }
      }
      //if 0 is present in first row
      if(r0){
          for(int j=0;j<m;j++){
              matrix[0][j]=0;
          }
      }
      //if 0 is present in first col
      if(c0){
          for(int i=0;i<n;i++){
              matrix[i][0]=0;
          }
      }  
  }
}

public class SetMatrixZeroes {
    public static void main(String[] args) {
        int nums[][] = { {1,1,1},{1,0,1},{1,1,1}};
        Solution s = new Solution();
        s.setZeroes(nums);
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                System.out.print(nums[i][j] + " , ");
            }
          System.out.println();
        }
      }
}