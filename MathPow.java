import java.util.Scanner;

public class MathPow {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter a base number: ");
    int number = input.nextInt();

    System.out.println("Enter the power to raise the number to: ");
    int power = input.nextInt();

    System.out.println(number + " raised to the power of " + power + " is " + Math.pow(number, power) + ".");

    input.close();
  }
}
