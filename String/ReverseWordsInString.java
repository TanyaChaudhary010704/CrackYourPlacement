package String;

public class ReverseWordsInString {

  public String reverseWords(String s) {
      String[] arr = s.split(" ");
      StringBuilder res = new StringBuilder();
      for(int i=arr.length-1;i>=0;i--){
          if(!arr[i].equals("")){
             res.append(arr[i].trim()).append(" "); 
          }
          
      }
      return res.toString().trim();
  }
}
