import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Sumas {
  public static void main(String[] args) throws Exception {

    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

    int op = 0;
    double a = 0.0;
    double b = 0.0;

    System.out.flush();

    while (op != 6) {

      System.out.println("1. Suma\n2. Resta\n3. Multiplicación\n4. "
                         + "División\n5. Potencia\n6. salir ");
      op = Integer.parseInt(br.readLine());

      System.out.println("Ingrese el primer número: ");
      a = Double.parseDouble(br.readLine());
      System.out.println("Ingrese el segundo número: ");
      b = Double.parseDouble(br.readLine());

      switch (op) {
      case 1:
        System.out.println(a + " + " + b + " = " + (a + b));
        break;
      case 2:
        System.out.println(a + " - " + b + " = " + (a - b));
        break;
      case 3:
        System.out.println(a + " * " + b + " = " + (a * b));
        break;
      case 4:
        if (b != 0) {
          System.out.println(a + " / " + b + " = " + (a / b));
        } else {
          System.out.println("Division por cero no permitida.");
        }
        break;
      case 5:
        int tmp = 0;
        for (int i = 1; i <= b; i++) {
          tmp *= a;
        }
        System.out.println(a + "^" + b + " = " + tmp);
        break;
      default:
        System.out.println("Opción no válida. Intente de nuevo.");
      }
    }
  }
}
