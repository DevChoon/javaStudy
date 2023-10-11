import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ListEx {
  public static void main(String[] args) {
    List<String> listString = new ArrayList<>();
    List<Integer> list1 = new ArrayList<>();
    List<Integer> list2 = new ArrayList<Integer>();
    ArrayList<Integer> list3 = new ArrayList<>();

    listString.add("치킨");
    listString.add("치킨");

    listString.set(1,"피자");

    boolean containsChicken = listString.contains("치킨");
    System.out.println(containsChicken);



    System.out.println(listString.get(0));
  }
}
