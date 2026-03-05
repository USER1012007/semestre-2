import java.util.Scanner;

public class main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int op = 0;
    int arr[] = {0};

    while (true) {
      System.out.println("Seleccione una opción:");
      System.out.println("1. Llenar un arreglo");
      System.out.println("2. Imprimir un arreglo");
      System.out.println("3. Sumar elementos de un arreglo");
      System.out.println("4. Salir");
      op = scanner.nextInt();

      if (op == 4)
        break;

      switch (op) {
      case 1:
        System.out.println("Ingrese el tamaño del arreglo:");
        int n = scanner.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
          System.out.println("Ingrese un numero:");
          arr[i] = scanner.nextInt();
        }
        break;
      case 2:
        if (arr == null) {
          System.out.println("el arreglo esta vacio");
        } else {
          System.out.println("elementos del arreglo:");
          for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
          }
        }
        break;
      case 3:
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
          sum += arr[i];
        }
        System.out.println("Suma: " + sum);

        break;

      default:
        System.out.println("ingrese opcion valida. bye bye");
        break;
      }
    }
    scanner.close();
  }
}
