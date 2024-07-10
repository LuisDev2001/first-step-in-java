import java.util.Scanner;

public class ValidPassword {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Ingrese la contraseña: ");
    String password = input.next();

    if (password.length() < 8) {
      System.out.println("Error: La contraseña debe tener al menos 8 caracteres.");
    } else if (password.equals(password.toLowerCase()) || password.equals(password.toUpperCase())) {
      System.out.println("Error: La contraseña debe tener al menos una letra mayúscula y una minúscula.");
    } else if (!password.matches(".*\\d.*")) {
      System.out.println("Error: La contraseña debe tener al menos un número.");
    } else if (!password.matches(".*[!@#$].*")) {
      System.out.println("Error: La contraseña debe contener al menos un carácter especial (por ejemplo, !, @, #, $).");
    } else {
      System.out.println("¡Contraseña segura! Cumple con todos los criterios.");
    }

    input.close();
  }
}
