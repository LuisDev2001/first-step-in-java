import java.util.Scanner;
import java.util.Arrays;

public class ArrayCopyElements {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[] initNumbers = { 1, 2, 3 };
    int[] newNumbers = Arrays.copyOf(initNumbers, 5);

    System.out.println("Ingrese un numero para agregar al arreglo: ");
    newNumbers[3] = input.nextInt();

    System.out.println("Ingrese otro numero para agregar al arreglo: ");
    newNumbers[4] = input.nextInt();

    System.out.println("La lista de numeros es: " + Arrays.toString(newNumbers));

    input.close();
  }
}
