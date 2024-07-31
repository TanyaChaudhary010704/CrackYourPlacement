package String;

import java.util.HashMap;

public class IntegerToRoman {
  // public static String intToRoman(int num) {

  //   HashMap<Integer, String> symbols = new HashMap<>();

  //   symbols.put(1, "I");
  //   symbols.put(5, "V");
  //   symbols.put(10, "X");
  //   symbols.put(50, "L");
  //   symbols.put(100, "C");
  //   symbols.put(500, "D");
  //   symbols.put(1000, "M");

  //   String result = new String();

  //   int place = 1;
  //   while (num > 0) {

  //     int rem = num % 10;
  //     String curr = "";

  //     if (rem == 4) {
  //       curr = symbols.get(place) + symbols.get(place * 5);

  //     }

  //     else if (rem == 9) {
  //       curr = symbols.get(place) + symbols.get(place * 10);
  //     }

  //     else {

  //       if (rem > 4) {
  //         curr = (symbols.get(5 * place));
  //         for (int i = 0; i < rem - 5; i++) {
  //           curr= curr+(symbols.get(place));
  //         }
  //       }

  //       else {
  //         for (int i = 0; i < rem; i++) {
  //           curr = curr +(symbols.get(place));
  //         }
  //       }
  //     }
  //     result = curr+result;
  //     place *= 10;
  //     num = num / 10;

  //   }

  //   return result;

  // }

  public static void main(String[] args) {
    System.out.println(intToRoman(3749));
  }
    public static String intToRoman(int num) {
        int[] n = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] s = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int i =0;
        String str = new String(); 
        while (num>0){
            if (num>=n[i]){
                str=str+s[i];
                num-=n[i];
            } else{
                i++;
            }
        }
        return str;
    }
}
