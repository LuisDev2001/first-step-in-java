import java.util.Scanner;

public class AverageResult {
  public static void main(String[] args) {
    // Scanner input = new Scanner(System.in);
    // double average = 0;

    // System.out.println("Ingrese la primera nota: ");
    // int nota1 = input.nextInt();
    // System.out.println("Ingrese la segunda nota: ");
    // int nota2 = input.nextInt();
    // System.out.println("Ingrese la tercera nota: ");
    // int nota3 = input.nextInt();
    // System.out.println("Ingrese la cuarta nota: ");
    // int nota4 = input.nextInt();

    // int[] notas = new int[] { nota1, nota2, nota3, nota4 };

    // for (int i = 0; i < notas.length; i++) {
    // average = average + notas[i];
    // }

    // average = average / notas.length;

    // System.out.println("El promedio de las notas es: " + average);

    // input.close();
    Scanner input = new Scanner(System.in);
    int[] notas = new int[4];
    double suma = 0;

    for (int i = 0; i < notas.length; i++) {
      System.out.println("Ingrese la nota " + (i + 1) + ": ");
      notas[i] = input.nextInt();
      suma += notas[i];
    }

    double promedio = suma / notas.length;

    System.out.println("El promedio de las notas es: " + promedio);

    input.close();
  }
}
