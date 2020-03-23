import java.util.ArrayList;
import java.util.Arrays;

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
    return -1;
  }

  public int[] bubble(int[] list, boolean ascending) {

    ArrayList<Integer> tempArray = new ArrayList<Integer>();
    for(int i: list){
      tempArray.add(i);
    }
    int count = 0;

    for(int i = 0; i < tempArray.size(); i++){
      int temp = tempArray.get(i+1);
      if(tempArray.get(i) > temp) {
        tempArray.set(i + 1, tempArray.get(i));
        tempArray.set(i, temp);
        count++;
      }
      if(count > 0){
        int[] tempInt = new int[tempArray.size()];
        int z = 0;
        for(int x: tempArray){
          tempInt[z] = x;
        }
        bubble(tempInt, true);
      }else if(count == 0){
        int[] tempInt = new int[tempArray.size()];
        int z = 0;
        for(int x: tempArray){
          tempInt[z] = x;
        }

        return tempInt;
      }
    }

    return null;
  }

  public ArrayList<String> bubble(ArrayList<String> list, boolean ascending) {
    return null;
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
