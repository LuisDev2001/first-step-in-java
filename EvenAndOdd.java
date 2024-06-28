import java.util.Scanner;

public class EvenAndOdd {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int number = input.nextInt();

    boolean isEven = number % 2 == 0;

    if (isEven) {
      System.out.println(number + " is even.");
    } else {
      System.out.println(number + " is odd.");
    }

    input.close();
  }
}