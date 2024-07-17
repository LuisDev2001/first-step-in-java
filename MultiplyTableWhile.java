import java.util.Scanner;

public class MultiplyTableWhile {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int number = 1;

    while (number != 0) {
      System.out.println("Enter a number: ");
      number = input.nextInt();

      if (number == 0) {
        break;
      } else {
        for (int i = 1; i <= 12; i++) {
          System.out.println(number + " x " + i + " = " + (number * i));
        }
        break;
      }
    }

    input.close();
  }
}
