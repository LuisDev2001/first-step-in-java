import java.util.Scanner;

public class ConvertQualification {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Ingrese una calificaion del 1 al 5");
    int qualification = input.nextInt();

    switch (qualification) {
      case 1:
        System.out.println("Muy deficiente");
        break;
      case 2:
        System.out.println("Deficiente");
        break;
      case 3:
        System.out.println("Suficiente");
        break;
      case 4:
        System.out.println("Notable");
        break;
      case 5:
        System.out.println("Sobresaliente");
        break;

      default:
        System.out.println("Error!! calificacion no valida!");
        break;
    }

    input.close();
  }
}
