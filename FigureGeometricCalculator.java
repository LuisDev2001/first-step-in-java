import java.util.InputMismatchException;
import java.util.Scanner;

public class FigureGeometricCalculator {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Ingrese una opcion: ");

    try {
      double area = switch (input.nextInt()) {
        case 1 -> {
          System.out.println("Ingrese el radio: ");
          double radius = input.nextDouble();
          yield Math.PI * Math.pow(radius, 2);
        }
        case 2 -> {
          System.out.println("Ingrese el lado: ");
          double side = input.nextDouble();
          yield Math.pow(side, 2);
        }
        case 3 -> {
          System.out.println("Ingrese la base: ");
          double base = input.nextDouble();
          System.out.println("Ingrese la altura: ");
          double height = input.nextDouble();
          yield base * height / 2;
        }
        default -> 0;
      };

      if (area == 0) {
        System.out.println("Opcion no valida");
      } else {
        System.out.println("El area es: " + area);
      }

      input.close();
    } catch (InputMismatchException error) {
      System.out.println("Intente con números.");
    }
  }
}
