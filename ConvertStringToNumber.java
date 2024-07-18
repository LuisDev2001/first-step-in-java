import java.util.Scanner;

public class ConvertStringToNumber {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    try {
      System.out.print("Enter a string: ");
      String str = input.nextLine();

      System.out.println("The number is: " + Integer.parseInt(str));
      System.out.println("El tipo de dato es: " + Integer.valueOf(str).getClass().getName());
      input.close();
    } catch (NumberFormatException e) {
      System.out.println("The string is not a integer number.");
    }
  }
}
