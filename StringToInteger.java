import java.util.Scanner;

public class StringToInteger {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingrese una cadena de caracteres que represente un número entero:");
    String input = scanner.nextLine();

    try {
      int number = Integer.parseInt(input);
      System.out.println("El número entero es: " + number);
    } catch (NumberFormatException e) {
      System.out.println("La cadena ingresada no puede ser convertida en un número entero.");
    } finally {
      scanner.close();
    }
  }
}
