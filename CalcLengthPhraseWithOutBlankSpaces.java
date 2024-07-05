import java.util.Scanner;

public class CalcLengthPhraseWithOutBlankSpaces {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter a phrase: ");
    String phrase = input.nextLine();
    int lengthPhrase = phrase.replace(" ", "").length();

    System.out.println("The length of the phrase without blank spaces is: " + lengthPhrase);

    input.close();
  }
}
