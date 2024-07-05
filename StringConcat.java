import java.util.Scanner;

public class StringConcat {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter your first name: ");
    String firstName = input.nextLine();

    System.out.println("Enter your last name: ");
    String lastName = input.nextLine();

    String fullName = firstName.concat(" ").concat(lastName);
    System.out.println("Your full name is: " + fullName);

    input.close();
  }
}
