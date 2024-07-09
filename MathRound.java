import java.util.Scanner;

public class MathRound {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a double number: ");
    double number = input.nextDouble();

    System.out.println("The rounded value of " + number + " is " + Math.round(number) + ".");

    input.close();
  }
}
