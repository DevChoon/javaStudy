import java.util.ArrayList;
import java.util.List;

public class CollectionLoopEx {
  public static void main(String[] args) {
    List<String> foods = new ArrayList<>();

    foods.add("치킨");
    foods.add("피자");
    foods.add("햄버거");

    for(String food: foods){
      System.out.println(food + " 맛있어요");
    }

    if(foods.isEmpty()){
      System.out.println("목록 없음");
    } else {
      System.out.println("목록에는 " + foods.size() + "개의 음식이 있습니다.");
    }
  }
}
