package Mathematical;

public class ExcelSheetColTitle {
  public static void main(String[] args) {
    System.out.println(convertToTitle(28));
  }
  
  public static String convertToTitle(int columnNumber) {
    String ans = "";
    int n = columnNumber;
    while (n > 0) {
        n--;
        int rem = n % 26;
        ans = (char)(rem + 'A') + ans;
        n /= 26;
    }
    return ans;
  }
}
