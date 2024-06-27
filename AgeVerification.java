import java.util.Scanner;

public class AgeVerification {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Ingrese su año de nacimiento: ");
    int birthYear = scanner.nextInt();
    final int currentYear = 2024;

    int age = currentYear - birthYear;

    String message = age >= 18 ? "Eres mayor de edad" : "Eres menor de edad";

    System.out.println(message + " y tienes " + age + " años.");

    scanner.close();
  }
}
