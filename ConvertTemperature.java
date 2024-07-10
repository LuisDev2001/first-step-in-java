import java.util.InputMismatchException;
import java.util.Scanner;

public class ConvertTemperature {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    double result = 0.0;

    try {
      System.out.println("Ingrese la temperatura: ");
      double temperature = input.nextDouble();

      System.out.println("Ingrese la unidad de medida C/F: ");
      String unit = input.next();

      if (unit.equals("C")) {
        result = (temperature - 32) * 5 / 9;
        System.out.println(temperature + " grados Celsius equivale a " + result + " grados Celsius.");
      } else if (unit.equals("F")) {
        result = (temperature * 9 / 5) + 32;
        System.out.println(temperature + " grados Celsius equivale a " + result + " grados Fahrenheit.");
      } else {
        System.out.println("Error: Unidad de medida no válida. Ingrese C para Celsius o F para Fahrenheit.");
      }
    } catch (InputMismatchException e) {
      System.out.println("Error: Temperatura no válida. Ingrese una temperatura numérica.");
    } finally {
      input.close();
    }
  }
}
