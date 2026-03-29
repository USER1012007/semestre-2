import java.util.Scanner;

public class aplicacion {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println(
        "Ingrese opcion:\n1. crear coche\n2. crear microbus\n3. crear "
        + "furgoneta de carga\n4. crear camion\n5. salir");
    int op = sc.nextInt();
    System.out.println("Ingrese numero de dias de alquiler: ");
    int dias = sc.nextInt();
    System.out.println("Ingrese matricula: ");
    String matricula = sc.next();

    double precioBase = 0;

    switch (op) {

    case 1:
      personas coche = new coche();
      coche.setMatricula(matricula);
      precioBase = coche.getPrecio();
      System.out.println("El precio base del coche es: " + precioBase);
      break;

    case 2:
      personas microbus = new microbuses();
      microbus.setMatricula(matricula);
      precioBase = microbus.getPrecio();
      System.out.println("El precio base del microbus es: " + precioBase);
      break;

    case 3:
      carga furgoneta = new furgonetas();
      furgoneta.setMatricula(matricula);
      System.out.println("Ingrese pma: ");
      double pma = sc.nextDouble();
      furgoneta.setPMA(pma);
      precioBase = furgoneta.getPrecio();
      System.out.println("El precio base de la furgoneta es: " + precioBase);
      System.out.println("El PMA de la furgoneta es: " + furgoneta.getPMA());
      break;

    case 4:
      carga camion = new camiones();
      camion.setMatricula(matricula);
      System.out.println("Ingrese pma: ");
      double pma1 = sc.nextDouble();
      camion.setPMA(pma1);
      precioBase = camion.getPrecio();
      System.out.println("El precio base del camion es: " + precioBase);
      System.out.println("El PMA de la furgoneta es: " + camion.getPMA());
      break;

    default:
      System.out.println("bye bye");
      break;
    }

    System.out.println("La matricula es: " + matricula);
    System.out.println("El precio total del alquiler es: " +
                       (precioBase * dias));

    sc.close();
  }
}
