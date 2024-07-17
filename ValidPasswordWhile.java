import java.util.Scanner;

public class ValidPasswordWhile {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String contrasena = "";

    // Solicitar la contraseña
    while (!contrasena.equals("secreto")) {
      System.out.println("Ingresa la contraseña: ");
      contrasena = scanner.nextLine();

      if (contrasena.equals("secreto")) {
        System.out.println("Contraseña correcta");
      } else {
        System.out.println("Contraseña incorrecta. intentalo de nuevo");
      }

    }
    scanner.close();
  }
}
