public class MathRandom {
  public static void main(String[] args) {
    double random = Math.random() * 355;
    int randomNumber = (int) Math.floor(random) + 1;
    System.out.println("Random number in range 1 to 355: " + randomNumber);
  }
}