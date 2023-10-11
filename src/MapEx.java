import java.util.HashMap;
import java.util.Map;

public class MapEx {
  public static void main(String[] args) {
    Map<String, String> dic = new HashMap<>();
    dic.put("chicken","닭");

    System.out.println(dic.get("chicken"));
  }
}
