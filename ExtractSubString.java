import java.util.Scanner;

public class ExtractSubString {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    try {
      System.out.println("Enter a phrase: ");
      String phrase = input.nextLine();

      System.out.println("Enter the starting index: ");
      int startIndex = input.nextInt();

      System.out.println("Enter the ending index: ");
      int endIndex = input.nextInt();

      String subString = phrase.substring(startIndex, endIndex);
      System.out.println("The substring is: " + subString);
    } catch (StringIndexOutOfBoundsException error) {
      System.out.println(error.getMessage());
      System.out.println("Please enter a valid index.");
    } finally {
      input.close();
    }
  }
}
