import java.util.Arrays;
import java.util.Scanner;

public class ArraySearchNumber {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int[] numbers = { 10, 50, 99 };

    System.out.println("Ingrese un número: ");
    int number = input.nextInt();

    int index = Arrays.binarySearch(numbers, number);

    if (index >= 0) {
      System.out.println("El número " + number + " se encuentra en la posición " + index + " del arreglo.");
    } else {
      System.out.println("El número " + number + " no se encuentra en el arreglo.");
    }

    input.close();
  }
}
