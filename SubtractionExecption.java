import java.util.Scanner;
import java.util.InputMismatchException;

public class SubtractionExecption {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Ingrese el primer número: ");
    int num1 = input.nextInt();

    System.out.println("Ingrese el segundo núnemro: ");
    int num2 = input.nextInt();

    try {
      int subtraction = num1 - num2;
      System.out.println("La resta es: " + subtraction);
      input.close();
    } catch (InputMismatchException error) {
      System.out.println("Por favor, ingrese solo números.");
    }
  }
}
