import java.util.Scanner;

public class FirstMethods {

  public static Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
    printNameAndAge();
  }

  public static void printNameAndAge() {
    System.out.print("Enter your name: ");
    String name = input.nextLine();
    System.out.print("Enter your age: ");
    int age = input.nextInt();
    System.out.println("My name is " + name + " and I am " + age + " years old.");
    input.close();
  }
}
