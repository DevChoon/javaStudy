import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileOutput {
  public static void main(String[] args) {
    FileWriter writer = null;
    try {
       writer = new FileWriter("src/output01.txt");
    } catch (IOException e) {
      System.out.println("파일 생성에 실패했습니다.");
      System.exit(1);
    }

    Scanner scanner = new Scanner(System.in);

    System.out.println("종료하려면 입력 없이 엔터");

    while(true) {
      String input = scanner.nextLine();
      if(input.equals("")){
        System.out.println("파일 입력을 종료합니다.");
        break;
      }

      try {
        writer.write(input);
      } catch (IOException e) {
        System.out.println("파일 생성에 실패했습니다.");
        System.exit(2);
      }
    }
    try {
      writer.close();
    } catch (IOException e) {
      System.out.println("닫기에 실패했습니다.");
    }
  }
}
