import java.util.ArrayList;
import java.util.Scanner;

public class RegisterStudents {
  private static ArrayList<String> nombres = new ArrayList<>();
  private static ArrayList<Double> notas = new ArrayList<>();

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int opcion;

    do {
      System.out.println("\nMenú de opciones:");
      System.out.println("1. Registrar alumno");
      System.out.println("2. Mostrar todos los alumnos");
      System.out.println("3. Mostrar promedio de notas");
      System.out.println("4. Buscar alumno por nombre");
      System.out.println("5. Modificar nota por nombre");
      System.out.println("6. Eliminar alumno por nombre");
      System.out.println("7. Salir");
      System.out.print("Selecciona una opción: ");
      opcion = scanner.nextInt();
      scanner.nextLine(); // Limpiar buffer

      switch (opcion) {
        case 1:
          registrarAlumno(scanner);
          break;
        case 2:
          mostrarAlumnos();
          break;
        case 3:
          mostrarPromedioNotas();
          break;
        case 4:
          buscarAlumno(scanner);
          break;
        case 5:
          modificarNota(scanner);
          break;
        case 6:
          eliminarAlumno(scanner);
          break;
        case 7:
          System.out.println("Saliendo del programa...");
          break;
        default:
          System.out.println("Opción no válida.");
      }
    } while (opcion != 7);
  }

  private static void registrarAlumno(Scanner scanner) {
    System.out.print("Ingresa el nombre del alumno: ");
    String nombre = scanner.nextLine();
    if (nombre.isEmpty()) {
      System.out.println("El nombre no puede estar vacío.");
      return;
    }

    System.out.print("Ingresa la nota del alumno: ");
    try {
      double nota = scanner.nextDouble();
      if (nota < 0.00 || nota > 20.00) {
        System.out.println("La nota debe estar entre 0.00 y 20.00.");
        return;
      }
      nombres.add(nombre);
      notas.add(nota);
    } catch (Exception e) {
      System.out.println("Debes ingresar un número válido para la nota.");
      scanner.nextLine(); // Limpiar buffer
    }
  }

  private static void mostrarAlumnos() {
    if (nombres.isEmpty()) {
      System.out.println("No hay alumnos registrados.");
      return;
    }
    for (int i = 0; i < nombres.size(); i++) {
      System.out.println("Alumno: " + nombres.get(i) + " - Nota: " + notas.get(i));
    }
  }

  private static void mostrarPromedioNotas() {
    if (notas.isEmpty()) {
      System.out.println("No hay notas para calcular el promedio.");
      return;
    }
    double suma = 0;
    for (Double nota : notas) {
      suma += nota;
    }
    double promedio = suma / notas.size();
    System.out.println("El promedio de notas es: " + promedio);
  }

  private static void buscarAlumno(Scanner scanner) {
    System.out.print("Ingresa el nombre del alumno a buscar: ");
    String nombre = scanner.nextLine();
    int index = nombres.indexOf(nombre);
    if (index != -1) {
      System.out.println("Alumno: " + nombres.get(index) + " - Nota: " + notas.get(index));
    } else {
      System.out.println("El alumno no existe.");
    }
  }

  private static void modificarNota(Scanner scanner) {
    System.out.print("Ingresa el nombre del alumno cuya nota quieres modificar: ");
    String nombre = scanner.nextLine();
    int index = nombres.indexOf(nombre);
    if (index != -1) {
      System.out.print("Ingresa la nueva nota: ");
      try {
        double nuevaNota = scanner.nextDouble();
        if (nuevaNota < 0.00 || nuevaNota > 10.00) {
          System.out.println("La nota debe estar entre 0.00 y 10.00.");
          return;
        }
        notas.set(index, nuevaNota);
      } catch (Exception e) {
        System.out.println("Debes ingresar un número válido para la nota.");
        scanner.nextLine(); // Limpiar buffer
      }
    } else {
      System.out.println("El alumno no existe.");
    }
  }

  private static void eliminarAlumno(Scanner scanner) {
    System.out.print("Ingresa el nombre del alumno a eliminar: ");
    String nombre = scanner.nextLine();
    int index = nombres.indexOf(nombre);
    if (index != -1) {
      nombres.remove(index);
      notas.remove(index);
      System.out.println("Alumno eliminado.");
    } else {
      System.out.println("El alumno no existe.");
    }
  }
}