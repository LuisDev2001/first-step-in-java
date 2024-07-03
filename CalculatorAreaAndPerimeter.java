import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorAreaAndPerimeter {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Ingrese una opcion: \n Opcion 1: Area \n Opcion 2: Perimetro \n");
    int option = input.nextInt();

    System.out.println("Ingrese una opcion: \n Opcion 1: Circulo \n Opcion 2: Rectangulo \n");
    try {
      if (option == 1) {
        double area = switch (input.nextInt()) {
          case 1 -> {
            System.out.println("Ingrese el radio: ");
            double radius = input.nextDouble();
            yield Math.PI * Math.pow(radius, 2);
          }
          case 2 -> {
            System.out.println("Ingrese la base: ");
            double base = input.nextDouble();
            System.out.println("Ingrese la altura: ");
            double height = input.nextDouble();
            yield base * height;
          }
          default -> 0;
        };
        System.out.println("El resultado es: " + area);
      } else if (option == 2) {
        double perimeter = switch (input.nextInt()) {
          case 1 -> {
            System.out.println("Ingrese el radio: ");
            double radius = input.nextDouble();
            yield 2 * Math.PI * radius;
          }
          case 2 -> {
            System.out.println("Ingrese la base: ");
            double base = input.nextDouble();
            System.out.println("Ingrese la altura: ");
            double height = input.nextDouble();
            yield (base + height) * 2;
          }
          default -> 0;
        };
        System.out.println("El resultado es: " + perimeter);
      }

      input.close();
    } catch (InputMismatchException error) {
      System.out.println(error);
      System.out.println("Intente con números.");
    }
  }
}
