public class ArrayExample {
  public static void main(String[] args) {
    String[] days = {"월","화","수","목","금","토","일"};
    int lengthDays = days.length;

    for(String day : days){
      System.out.println(day);
    }

    System.out.println(days[0]);
  }
}
