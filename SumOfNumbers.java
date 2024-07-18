
import java.util.Scanner;

public class SumOfNumbers {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("Ingresa un número entero como cadena: ");
    String intInput = input.nextLine();

    System.out.print("Ingresa un número decimal como cadena: ");
    String doubleInput = input.nextLine();

    try {
      // Convertir las cadenas a tipos de datos correspondientes
      int intValue = Integer.valueOf(intInput);
      double doubleValue = Double.valueOf(doubleInput);

      double suma = intValue + doubleValue;

      System.out.println("La suma es: " + suma);
      input.close();
    } catch (NumberFormatException e) {
      System.out.println("Error: Las cadenas no representan números válidos.");
    }
  }
}
