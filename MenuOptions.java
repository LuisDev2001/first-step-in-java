import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuOptions {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Menu");
    System.out.println("Opcion 1");
    System.out.println("Opcion 2");
    System.out.println("Opcion 3");
    System.out.println("Ingrese una opcion: ");
    try {
      String optionSelected = switch (input.nextInt()) {
        case 1 -> "Guardar";
        case 2 -> "Cargar";
        case 3 -> "Salir";
        default -> "Opcion no valida";
      };

      System.out.println(optionSelected);

      input.close();
    } catch (InputMismatchException error) {
      System.out.println("Intente con números.");
    }
  }
}
