import java.util.Scanner;

public class MathRandomPow {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    boolean isPrime = true;

    System.out.print("Enter a number enter 1 to 30: ");
    int number = input.nextInt();

    if (number < 1 || number > 30) {
      System.out.println("The number must be between 1 and 30.");
      input.close();
      return;
    }

    int randomNumber = 1 + (int) (Math.random() * number);
    System.out.println("Número aleatorio entre 1 y " + number + ": " + randomNumber);

    double sqrt = Math.sqrt(randomNumber);

    for (int i = 2; i <= Math.sqrt(randomNumber); i++) {
      if (randomNumber % i == 0) {
        isPrime = false;
        break;
      }
    }

    if (isPrime && randomNumber > 1) {
      System.out.println(randomNumber + " es un número primo.");
    } else {
      System.out.println(randomNumber + " no es un número primo.");
    }

    System.out.println("La raíz cuadrada de " + randomNumber + " es: " + sqrt);

    input.close();
  }
}
