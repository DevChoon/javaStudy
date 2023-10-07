public class StringType {
  public static void main(String[] args) {
    String chicken = "바꿀문자치킨";
    String me = "나";
    String birthday = "1991.04.29";

    String chickenAndMe = chicken + me;
    int length = chickenAndMe.length();
    System.out.println(chickenAndMe);
    System.out.println(length);

    String replaced =  chicken.replaceAll("바꿀문자","새문자");
    System.out.println(replaced);

    String year = birthday.substring(0,4);
    String day = birthday.substring(8);

    System.out.println(year);
    System.out.println(day);
 }
}
