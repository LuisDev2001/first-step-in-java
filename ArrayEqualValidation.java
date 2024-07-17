import java.util.Arrays;

public class ArrayEqualValidation {
  public static void main(String[] args) {
    int[] numbers1 = { 1, 2, 3, 4, 5 };
    int[] numbers2 = { 1, 2, 3, 4, 5 };

    System.out.println("numbers1 == numbers2: ");
    System.out.println(Arrays.equals(numbers1, numbers2) ? "The arrays are equal." : "The arrays are not equal.");
  }
}
