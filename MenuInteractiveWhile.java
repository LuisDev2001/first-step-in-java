import java.util.Scanner;

public class MenuInteractiveWhile {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int optionSelected = 0;

    while (optionSelected != 5) {
      System.out.println("---------------------------------");
      System.out.println("1. Comprar produtos");
      System.out.println("2. Realizar devolución");
      System.out.println("3. Ver mis pedidos.");
      System.out.println("4. Preguntas frecuentes.");
      System.out.println("5. Salir.");
      System.out.println("---------------------------------");

      optionSelected = input.nextInt();

      switch (optionSelected) {
        case 1:
          System.out.println("Comprar productos");
          break;
        case 2:
          System.out.println("Realizar devolución");
          break;
        case 3:
          System.out.println("Ver mis pedidos.");
          break;
        case 4:
          System.out.println("Preguntas frecuentes.");
          break;
        case 5:
          System.out.println("Saliendo del programa...");
          break;
        default:
          System.out.println("Opción no válida");
          break;
      }
    }

    input.close();
  }
}
