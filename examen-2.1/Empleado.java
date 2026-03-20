import java.util.Scanner;

public class Empleado {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Ingrese el numero de trabajadores: ");
    int cant = sc.nextInt();

    AEmpleado lista[] = new AEmpleado[cant];

    for (int i = 0; i < lista.length; i++) {
      System.out.print("Horas trabajadas por empleado " + (i + 1) + ": ");
      lista[i] = new AEmpleado(sc.nextInt());
    }

    for (int i = 0; i < lista.length; i++) {
      double bruto = lista[i].SalarioBruto(lista[i].horasTotales);
      double neto = lista[i].SalarioNeto(bruto);

      System.out.printf("Trabajador %d | Bruto: $%.2f | Neto: $%.2f%n", (i + 1),
                        bruto, neto);
    }
    sc.close();
  }
}
