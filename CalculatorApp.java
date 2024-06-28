import java.util.Scanner;

public class CalculatorApp {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the first number: ");
    double firstNumber = input.nextDouble();

    System.out.println("Enter the second number: ");
    double secondNumber = input.nextDouble();

    System.out.println("======================================");
    System.out.println("           CALCULADORA SIMPLE         ");
    System.out.println("======================================");
    System.out.println("Por favor, elige una operación:");
    System.out.println("  1 - Suma (Añade dos números)");
    System.out.println("  2 - Resta (Resta el segundo número del primero)");
    System.out.println("  3 - Multiplicación (Multiplica dos números)");
    System.out.println("  4 - División (Divide el primer número entre el segundo)");
    System.out.println("======================================");
    System.out.print("Ingresa el número de la operación que deseas realizar: ");

    int optionSelected = input.nextInt();

    double result = 0;

    switch (optionSelected) {
      case 1:
        result = firstNumber + secondNumber;
        break;
      case 2:
        result = firstNumber - secondNumber;
        break;
      case 3:
        result = firstNumber * secondNumber;
        break;
      case 4:
        if (secondNumber == 0) {
          System.out.println("Error: Division by zero is not allowed.");
        } else {
          result = firstNumber / secondNumber;
        }
        break;
      default:
        System.out.println("Invalid option. Please select 1, 2, 3, or 4.");
        break;
    }

    System.out.println("The result is: " + result);
    input.close();
  }
}
