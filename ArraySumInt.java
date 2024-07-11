public class ArraySumInt {
  public static void main(String[] args) {
    int[] numbers = { 1, 2, 3 };
    int sum = 0;

    for (int i = 0; i < numbers.length; i++) {
      sum = sum + numbers[i];
    }

    System.out.println("La suma de los elementos del array es: " + sum);
  }
}
