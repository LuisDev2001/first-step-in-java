import java.util.Scanner;

public class TransformStringToUpperCase {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter a word: ");
    String word = input.nextLine().toUpperCase();

    System.out.println("The word in uppercase is: " + word);

    input.close();
  }
}
