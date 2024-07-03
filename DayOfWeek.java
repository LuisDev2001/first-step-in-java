import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * DayOfWeek
 */
public class DayOfWeek {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Ingrese un numero del 1 al 7");

    try {
      int numberDay = input.nextInt();
      String day = switch (numberDay) {
        case 1 -> "Lunes";
        case 2 -> "Martes";
        case 3 -> "Miércoles";
        case 4 -> "Jueves";
        case 5 -> "Viernes";
        case 6 -> "Sábado";
        case 7 -> "Domingo";
        default -> "No existe ese día";
      };
      System.out.println(day);
    } catch (InputMismatchException error) {
      System.out.println("Intente con números.");
    }

    input.close();
  }
}
