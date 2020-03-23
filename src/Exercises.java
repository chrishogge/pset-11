import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Exercises {

  public int findMe(int[] list, int target) {

    if (Arrays.asList(list).contains(null) || Arrays.asList(list) == null) {
      return -1;
    }

    int i = 0;

    for(int x: list){
      if(x == target){
        return i;
      } else{
        i++;
      }
    }

    return -1;
  }

  public int findMe(ArrayList<String> list, String target) {

    if (list == null || list.size() == 0 || target == null) {
      return -1;
    }

    for(int i = 0; i < list.size(); i++){
      if(list.get(i).equals(target)){
        return i;
      }
    }

    return -1;
  }

  /*
    Needs to actually implement binary searching
   */

  public int findMeFaster(ArrayList<Integer> list, int target) {

    if (list.contains(null) || list == null || list.size() == 0) {
      return -1;
    }

    int low = 0;
    int high = list.size()-1;
    int mid = (low + high)/2;

    if(list.get(mid) == target){
      return mid;
    }

    while(low <= high){
      mid = (low + high)/2;
      if(target > list.get(mid)){
        low = mid + 1;
      }else if(target < list.get(mid)){
        high = mid - 1;
      }else if(list.get(mid) == target){
        return mid;
      }
    }

    return -1;

  }

  public int findMeFaster(String[] list, String target) {
    if (Arrays.asList(list).contains(null) || Arrays.asList(list) == null) {
      return -1;
    }

    int start = 0;
    int end = list.length - 1;
    int middle = 0;
    while (start <= end) {
      middle = (start + end) / 2;

      if (list[middle].compareTo(target) < 0) {
        start = middle + 1;
      } else if (list[middle].compareTo(target) > 0) {
        end = middle - 1;
      } else {
        return middle;
      }
    }
    return -1;
  }

  public int[] bubble(int[] list, boolean ascending) {

    if (Arrays.asList(list).contains(null) || Arrays.asList(list) == null) {
      return null;
    }

    for (int i = 0; i < list.length - 1; i++) {
      for (int j = 0; j < list.length - i - 1; j++) {
        if (list[j] > list[j + 1]) {
          int temp = list[j];
          list[j] = list[j + 1];
          list[j + 1] = temp;
        }
      }
    }

    if (!ascending) {
      int i, t;
      int n = list.length;
      for (i = 0; i < n / 2; i++) {
        t = list[i];
        list[i] = list[n - i - 1];
        list[n - i - 1] = t;
      }
    }

    return list;
  }

  public ArrayList<String> bubble(ArrayList<String> list, boolean ascending) {

    if (list.contains(null) || list == null) {
      return null;
    }

    for (int i = 0; i < list.size() - 1; i++) {
      for (int j = 0; j < list.size() - 1 - i; j++) {
        if (list.get(j).compareTo(list.get(j + 1)) > 0) {
          String temp = list.get(j);
          list.set(j, list.get(j + 1));
          list.set(j + 1, temp);
        }
      }
    }

    if (!ascending) {
      Collections.reverse(list);
    }

    return list;
  }

  public ArrayList<Integer> insertion(ArrayList<Integer> list, boolean ascending) {
    return null;
  }

  public String[] insertion(String[] list, boolean ascending) {
    return null;
  }

  public int[] selection(int[] list, boolean ascending) {
    return null;
  }

  public ArrayList<String> selection(ArrayList<String> list, boolean ascending) {
    return null;
  }

  public ArrayList<Integer> merge(ArrayList<Integer> list, boolean ascending) {
    return null;
  }

  public String[] merge(String[] list, boolean ascending) {
    return null;
  }

  public static void main(String args[]){

    Exercises ex = new Exercises();

    int[] test = {10, 5, 11, 3, 5, 6, 1, 3};
    System.out.println(ex.findMe(test,9));

    ArrayList<String> testStrings = new ArrayList<String>(Arrays.asList("Hello", "Howdy", "Hey", "Sup"," Sup"));
    System.out.println(ex.findMe(testStrings, "Sup"));

    ArrayList<Integer> test2 = new ArrayList(Arrays.asList(1, 2, 3, 5, 7, 8, 9, 9, 10));
    System.out.println(ex.findMeFaster(test2, 10));

    System.out.println(Arrays.toString(ex.bubble(test, true)));
  }
}
