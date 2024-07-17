package Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class ChocolateDistribution {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(3);
    list.add(4);
    list.add(1);
    list.add(9);
    list.add(56);
    list.add(7);
    list.add(9);
    list.add(12);
    Solution s = new Solution();
    System.out.println(s.findMinDiff(list,8,5));
  }
}
class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        long minDiff=Integer.MAX_VALUE;
        Collections.sort(a);

        for(int i=(m-1);i<a.size();i++)
        {
            minDiff=Math.min((a.get(i)-a.get(i-(m-1))),minDiff);
        }
        return minDiff;
    }
}
