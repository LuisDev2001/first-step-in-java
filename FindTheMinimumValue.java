public class FindTheMinimumValue {
  public static void main(String[] args) {
    // Definir un array de enteros
    int[] numbers = { 34, 23, 12, 45, 67, 1, 88, 10, 2 };

    // Encontrar el valor mínimo usando un bucle
    int minValue = numbers[0]; // Inicializar con el primer elemento
    for (int i = 1; i < numbers.length; i++) {
      if (numbers[i] < minValue) {
        minValue = numbers[i];
      }
    }

    // Imprimir el valor mínimo encontrado
    System.out.println("El valor mínimo es: " + minValue);
  }
}