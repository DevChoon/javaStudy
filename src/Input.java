import java.util.Scanner;

public class Input {
//  public static void main(String[] args) {
//    Scanner scanner;
//    scanner = new Scanner(System.in);
//    String input = scanner.nextLine();
//
//    System.out.println(input);
//
//    String nextInputFirst = scanner.next();
//    String nextInputSecond = scanner.next();
//
//    System.out.println(nextInputFirst);
//    System.out.println(nextInputSecond);
//  }

  public static void main(String[] args) {
    System.out.println("숫자를 입력해주세요.");
    Scanner scanner = new Scanner(System.in);
    String intInput = scanner.nextLine();
    try {
      int intValue = Integer.parseInt(intInput);
      System.out.println(intValue + 1);
    } catch (Exception e) {
      System.out.println("숫자를 입력해주세요 숫자");
    }
  }
}
