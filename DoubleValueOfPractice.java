import java.util.Scanner;

public class DoubleValueOfPractice {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    try {
      System.out.print("Enter a string: ");
      String str = input.nextLine();

      System.out.println("The double value of the string is " + Double.valueOf(str));

      input.close();
    } catch (NumberFormatException e) {
      System.out.println("The string is not a number.");
    }
  }
}
