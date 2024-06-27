import java.util.Scanner;

public class CalcAreaAndPerimeter {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the base of the rectangle: ");
    double base = scanner.nextDouble();

    System.out.println("Enter the height of the rectangle: ");
    double height = scanner.nextDouble();

    double perimeter = 2 * (base + height);

    double area = base * height;

    System.out.println("The perimeter of the rectangle is: " + perimeter);
    System.out.println("The area of the rectangle is: " + area);

    scanner.close();
  }
}
