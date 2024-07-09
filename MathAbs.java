import java.util.Scanner;

public class MathAbs {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a int number: ");
    int number = input.nextInt();

    System.out.println("The absolute value of " + number + " is " + Math.abs(number) + ".");

    input.close();
  }
}
