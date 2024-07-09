import java.util.Scanner;

public class MathRandom2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Ingrese el límite inferior: ");
    int limiteInferior = input.nextInt();

    System.out.print("Ingrese el límite superior: ");
    int limiteSuperior = input.nextInt();

    if (limiteInferior >= limiteSuperior) {
      System.out.println("El límite superior debe ser mayor que el límite inferior.");
    } else {
      int numeroAleatorio = limiteInferior + (int) (Math.random() * ((limiteSuperior - limiteInferior) + 1));
      System.out.println("Número aleatorio en el rango especificado: " + numeroAleatorio);
    }

    input.close();
  }
}
