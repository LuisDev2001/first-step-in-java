import java.util.Scanner;

public class MultiplicationMethods {
  public static Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
    int[] number = getNumber();
    printMultiplicationTable(number);
  }

  public static int[] getNumber() {
    int[] number = new int[3];
    for (int i = 0; i < number.length; i++) {
      System.out.println("Enter number " + (i + 1) + ": ");
      number[i] = input.nextInt();
      if (number[i] < 1 || number[i] > 10) {
        System.out.println("Number must be between 1 and 10.");
        i--;
      }
    }
    return number;
  }

  public static void printMultiplicationTable(int[] number) {
    for (int i = 0; i < number.length; i++) {
      for (int j = 1; j <= 10; j++) {
        System.out.println(number[i] + " x " + j + " = " + (number[i] * j));
      }
      System.out.println("--------------------");
    }
  }
}
