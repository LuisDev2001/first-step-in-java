import java.util.Scanner;

public class VerifyOnlyLetters {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a string: ");
    String str = input.nextLine();
    boolean onlyLetters = true;

    for (int i = 0; i < str.length(); i++) {
      if (!Character.isLetter(str.charAt(i)) && !Character.isWhitespace(str.charAt(i))) {
        onlyLetters = false;
        break;
      }
    }

    if (onlyLetters) {
      System.out.println("The string contains only letters.");
    } else {
      System.out.println("The string contains other characters.");
    }

    input.close();
  }
}