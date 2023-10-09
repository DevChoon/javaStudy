import java.util.Random;
import java.util.Scanner;

public class randomNumber {
  public static void main(String[] args) {
    Random random = new Random();
    int randomNumber = random.nextInt(256);

    Scanner scanner = new Scanner(System.in);

    System.out.println("지금부터 제가 생각한 숫자를 맞추는 게임을 해보겠습니다.");

    for(int i = 0; i < 8; i++){
      System.out.println(8 - i + "번의 기회가 있습니다.");
      System.out.println("예상한 숫자를 입력해주세요.");

      String input = scanner.nextLine();
      int guess = Integer.parseInt(input);

      if(randomNumber == guess) {
        System.out.println("정답입니다!");
        break;
      } else if ( randomNumber > guess){
        System.out.println("업! 제가 생각한 숫자보다 작네요.");
      } else if (randomNumber < guess) {
        System.out.println("다운! 제가 생각한 숫자보다 크네요.");
      }

      if(i == 7){
        System.out.println("남은 기회가 없습니다.");
      }
    }
    System.out.println("게임을 종료합니다.");
  }
}
