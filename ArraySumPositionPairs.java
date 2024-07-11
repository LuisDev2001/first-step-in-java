public class ArraySumPositionPairs {
  public static void main(String[] args) {
    int[] numbers = { 1, 2, 3, 4, 5 };
    int sum = 0;

    for (int i = 0; i < numbers.length; i++) {
      if (i % 2 == 0) {
        sum = sum + numbers[i];
      }
    }

    System.out.println("La suma de los numeros en posiciones pares es: " + sum);
  }
}
