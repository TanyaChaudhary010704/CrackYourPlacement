package SearchingAndSorting;

import java.util.HashSet;

public class FindPairGivenDiff {
  public int findPair(int n, int x, int[] arr) {

    HashSet<Integer> nn = new HashSet<>();
  
    for(int i=0; i<n; i++){
        if (nn.contains(arr[i] - x) || nn.contains(arr[i] + x)) 
            return 1;
        else nn.add(arr[i]);
    }
    return -1;
  }
}
