import java.util.Scanner;
import java.util.InputMismatchException;

public class AvailableDay {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Ingrese un día de la semana del 1 al 7");
    try {
      String availableDayMessage = switch (input.nextInt()) {
        case 1, 2, 3, 4, 5 -> "Día habil";
        case 6, 7 -> "Día no habil";
        default -> "No es un día de la semana";
      };

      System.out.println(availableDayMessage);

      input.close();
    } catch (InputMismatchException error) {
      System.out.println("Intente con números.");
    }
  }
}
