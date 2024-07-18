import java.util.Scanner;

public class CountWhiteSpaceString {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter a string: ");
    String str = input.nextLine();

    int count = 0;

    for (int i = 0; i < str.length(); i++) {
      if (Character.isWhitespace(str.charAt(i))) {
        count++;
      }
    }

    System.out.println("The quantity of white space is: " + count);

    input.close();
  }
}
