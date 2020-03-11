import java.util.ArrayList;
import java.util.Arrays;

public class Exercises {

  public int findMe(int[] list, int target) {

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

    int i = 0;

    for(String tempStr: list){
      if(tempStr.equals(target)){
        return i;
      }

      i++;
    }

    return -1;
  }

  public int findMeFaster(ArrayList<Integer> list, int target) {

    int mid = list.size()/2;

    return -1;
  }

  public int findMeFaster(String[] list, String target) {
    return -1;
  }

  public int[] bubble(int[] list, boolean ascending) {
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

    int[] test = {1, 2, 3, 5, 7, 8, 9, 9, 10};
    System.out.println(ex.findMe(test,9));

    ArrayList<String> testStrings = new ArrayList<String>(Arrays.asList("Hello", "Howdy", "Hey", "Sup"," Sup"));
    System.out.println(ex.findMe(testStrings, "Sup"));

    ArrayList<Integer> test2 = new ArrayList(Arrays.asList(1, 2, 3, 5, 7, 8, 9, 9, 10));
    System.out.println(ex.findMeFaster(test2, 10));
  }
}
