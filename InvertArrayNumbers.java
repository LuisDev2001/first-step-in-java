import java.util.Arrays;

public class InvertArrayNumbers {
  public static void main(String[] args) {
    int[] numbers = { 1, 2, 3, 4, 5, 6 };
    System.out.println("Array original: " + Arrays.toString(numbers));

    for (int i = 0; i < numbers.length / 2; i++) {
      int temp = numbers[i];
      numbers[i] = numbers[numbers.length - 1 - i];
      numbers[numbers.length - 1 - i] = temp;
    }

    System.out.println("Array invertido: " + Arrays.toString(numbers));
  }
}
