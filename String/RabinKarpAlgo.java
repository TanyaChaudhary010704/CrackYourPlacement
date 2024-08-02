package String;
import java.util.ArrayList;
public class RabinKarpAlgo {    
    ArrayList<Integer> search(String pattern, String text)
    {
        int p = pattern.length();
        ArrayList<Integer> res = new ArrayList<>();
        // your code here
        for(int i=0;i<=text.length()-p;i++){
            String sub = text.substring(i,i+p);
            if(sub.equals(pattern)){
                res.add(i+1);
            }
        }
        return res;
    }
}
