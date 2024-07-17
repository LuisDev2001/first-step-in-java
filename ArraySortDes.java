import java.util.Arrays;
import java.util.Random;
import java.util.Collections;

public class ArraySortDes {
  public static void main(String[] args) {
    Integer[] numbers = new Integer[10];

    Random random = new Random();
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = random.nextInt(100) + 1;
    }

    // Arrays.sort(numbers);

    System.out.println("Array original: " + Arrays.toString(numbers));

    // for (int i = 0; i < numbers.length / 2; i++) {
    // int temp = numbers[i];
    // numbers[i] = numbers[numbers.length - 1 - i];
    // numbers[numbers.length - 1 - i] = temp;
    // }

    Arrays.sort(numbers, Collections.reverseOrder());

    System.out.println("Array invertido: " + Arrays.toString(numbers));
  }
}
