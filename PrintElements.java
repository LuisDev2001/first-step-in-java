public class PrintElements {
  public static void main(String[] args) {
    int[] numbers = { 1, 2, 3, 4, 5, 6 };

    for (int i = 0; i < numbers.length; i++) {
      System.out.println("\n" + "------------------");
      System.out.println(numbers[i]);
      System.out.println("------------------");
    }
  }
}