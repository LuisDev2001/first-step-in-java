import java.util.Random;
import java.util.Scanner;

public class GuestNumberDoWhile {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Random random = new Random();

    int numeroAleatorio = random.nextInt(20) + 1;

    System.out.println("Adivina un número entre el uno y el 20");
    System.out.println(numeroAleatorio);
    int numero;

    do {
      System.out.println("Introduce un número");
      numero = input.nextInt();
      input.close();

      if (numero > 20) {
        System.out.println("Error: Tarao");
        return;
      }

      if (numero > numeroAleatorio) {
        System.out.println("El número es mayor");
      } else if (numero < numeroAleatorio) {
        System.out.println("El número es menor");
      } else {
        System.out.println("Adivinaste");
      }

    } while (numero != numeroAleatorio);
  }
}
