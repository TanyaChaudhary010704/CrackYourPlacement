package Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Random;
public class RandomizedCollection {
  private Map<Integer,List<Integer>> map;
  private List<Integer> list;
  private int pos;
  
  public RandomizedCollection() {
      this.map = new HashMap<>();
      this.list = new ArrayList<>();
      this.pos = -1;
  }
  
  public boolean insert(int val) {
      if(map.get(val) == null) {
          pos++;
          list.add(pos,val);
          List<Integer> lst = new ArrayList<>();
          lst.add(pos);
          map.put(val, lst);
          return true;
      } else {
          pos++;
          list.add(pos,val);
          map.get(val).add(pos);
          return false;
      }
  }
  
  public boolean remove(int val) {
      if(map.get(val) == null) {
          return false;
      } else {
          List<Integer> lst = map.get(val);
          //get first indx of th val to be removed
          int idx = lst.remove(0);
          if(map.get(val).size() == 0)
              map.remove(val);
          
          //get last element to be swaped with element to be deleted
          int last = list.get(pos);
          //get pos list of last element and updte it
          if(idx != pos) {
              List<Integer> last_element_list = map.get(last);
              last_element_list.remove(new Integer(pos));
              last_element_list.add(idx);
              //overrrite the element to be deleted by last element
              list.set(idx, list.get(pos));
          }
          pos--;
          return true;
      }
  }
  
  public int getRandom() {
      Random rdm = new Random();
      return list.get(rdm.nextInt(this.pos+1));
  }
}
