import java.util.Scanner;

public class MathSquareRoot {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a number: ");
    double number = input.nextDouble();

    double squareRoot = Math.sqrt(number);

    System.out.println("The square of " + number + " is " + squareRoot + ".");

    input.close();
  }
}
