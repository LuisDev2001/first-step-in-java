import java.util.Scanner;

public class SearchStringCharacters {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter a word: ");
    String word = input.nextLine().toLowerCase();

    System.out.println("Enter a character to search for: ");
    String character = input.nextLine().toLowerCase();

    String message = word.indexOf(character) != -1
        ? "The character is in the word."
        : "The character is not in the word.";

    System.out.println(message);

    input.close();
  }
}
