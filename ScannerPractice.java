import java.util.Scanner;

public class ScannerPractice {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the first number: ");
    int firstNumber = scanner.nextInt();

    System.out.println("Enter the second number: ");
    int secondNumber = scanner.nextInt();

    int sum = firstNumber + secondNumber;
    int resta = firstNumber - secondNumber;
    int multiplicacion = firstNumber * secondNumber;
    int division = firstNumber / secondNumber;
    int modulo = firstNumber % secondNumber;

    System.out.println("The sum of the numbers is: " + sum);
    System.out.println("The subtraction of the numbers is: " + resta);
    System.out.println("The multiplication of the numbers is: " + multiplicacion);
    System.out.println("The division of the numbers is: " + division);
    System.out.println("The module of the numbers is: " + modulo);
    System.out.println(
        "The number " + firstNumber + " is greater than " + secondNumber + ": " + (firstNumber > secondNumber));
    System.out.println(
        "The number " + firstNumber + " is distinct to " + secondNumber + ": " + (firstNumber != secondNumber));
    System.out.println("The number " + firstNumber + "are divible by two: " + (firstNumber % 2 == 0));

    System.out.println("Enter the third number: ");
    int thirdNumber = scanner.nextInt();

    System.out.println("Enter the four number: ");
    int fourthNumber = scanner.nextInt();

    System.out.println(firstNumber > secondNumber && thirdNumber > fourthNumber);
    System.out.println(firstNumber > secondNumber || thirdNumber > fourthNumber);

    scanner.close();
  }
}
