import java.util.Scanner;
import java.util.InputMismatchException;

public class SecureDivision {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    try {
      System.out.println("Ingrese el primer número: ");
      int num1 = input.nextInt();

      System.out.println("Ingrese el segundo número: ");
      int num2 = input.nextInt();

      int division = num1 / num2;

      System.out.println("La divion es: " + division);

      input.close();
    } catch (ArithmeticException error) {
      System.out.println("No se puede dividir por cero");
    } catch (InputMismatchException error) {
      System.out.println("Intente con números.");
    }
  }
}
