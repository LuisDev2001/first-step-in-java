import java.util.Arrays;
import java.util.Scanner;

public class ArraySortNames {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String[] names = new String[4];

    for (int i = 0; i < names.length; i++) {
      System.out.println("Ingrese el nombre de la persona " + (i + 1) + ": ");
      names[i] = input.nextLine();
    }

    // Arrays.sort(names);

    String[] sortedNames = Arrays.stream(names).sorted().toArray(String[]::new);
    System.out.println("Nombres ordenados: " + Arrays.toString(sortedNames));
    // System.out.println("Nombres ingresados: " + Arrays.stream(names).sorted());

    input.close();
  }
}
