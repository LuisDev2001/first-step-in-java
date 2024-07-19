import java.util.Scanner;
import java.util.Random;

public class GeneratePassword {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Random random = new Random();
    boolean hasUpperCase, hasLowerCase, hasDigit;

    System.out.println("Ingresa la longitud de la contraseña: ");
    int passwordLength = input.nextInt();
    input.close();
    String[] charactersList = new String[passwordLength];

    do {
      hasUpperCase = false;
      hasLowerCase = false;
      hasDigit = false;

      for (int i = 0; i < passwordLength; i++) {
        int randomCharacter = random.nextInt(3);
        if (randomCharacter == 0) {
          char digit = (char) (random.nextInt(10) + 48);
          charactersList[i] = String.valueOf(digit);
          hasDigit = true;
        } else if (randomCharacter == 1) {
          char upperCase = (char) (random.nextInt(26) + 65);
          charactersList[i] = String.valueOf(upperCase);
          hasUpperCase = true;
        } else {
          char lowerCase = (char) (random.nextInt(26) + 97);
          charactersList[i] = String.valueOf(lowerCase);
          hasLowerCase = true;
        }
      }
    } while (!(hasDigit && hasUpperCase && hasLowerCase));

    System.out.println("Contraseña generada: ");
    for (String character : charactersList) {
      System.out.print(character);
    }
  }
}
