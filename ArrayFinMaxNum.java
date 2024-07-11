import java.util.Arrays;
import java.util.Scanner;

public class ArrayFinMaxNum {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[] numbers = new int[5];

    for (int i = 0; i < numbers.length; i++) {
      System.out.println("Ingrese el numero " + (i + 1) + ": ");
      numbers[i] = input.nextInt();
    }

    // int maxNum = numbers[0];
    // for (int i : numbers) {
    // if (i > maxNum) {
    // maxNum = i;
    // }
    // }

    // System.out.println("El numero mayor es: " + maxNum);

    System.out.println("El numero mayor es: " + Arrays.stream(numbers).max().getAsInt());

    input.close();
  }
}
