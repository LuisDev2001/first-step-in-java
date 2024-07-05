import java.util.Scanner;

public class StringLength {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a string: ");
    String str = input.nextLine();

    int lengthOfString = str.length();

    System.out.println("The length of the string is: " + lengthOfString);

    input.close();
  }
}
