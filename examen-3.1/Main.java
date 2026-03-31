import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    Cliente clientes[] = null;
    Empresa empresas[] = null;
    Sector sectores[] = null;

    while (true) {

      System.out.println("1. sectores");
      System.out.println("2. empresas");
      System.out.println("3. clientes");
      System.out.println("4. crear orden para cliente");
      System.out.println("5. calcular diferencia para sector");
      System.out.println("6. calcular diferencia para todos los sectores");
      System.out.println("7. calcular diferencia para empresa");
      System.out.println("8. calcular valores de n acciones para empresa");
      System.out.println("9. calcular indice de un sector");
      System.out.println("10. salir");

      int op = scanner.nextInt();

      if (op == 10) {
        break;
      }

      switch (op) {
      case 1:
        sectores = new Sector[10];
        int numSectores = 0;
        do {
          System.out.println("cuantos sectores quieres ingresar?");
          numSectores = scanner.nextInt();
        } while (numSectores <= 0 || numSectores > 10);

        for (int i = 0; i < numSectores; i++) {
          System.out.println("Ingrese el nombre del sector:");
          String nombreSector = scanner.next();
          Sector sector = new Sector(nombreSector);
          sectores[i] = sector;
        }
        break;

      case 2:

        empresas = new Empresa[10];

        if (sectores == null) {
          System.out.println("no hay sectores disponibles");
          break;
        }

        int numEmpresas = 0;

        do {
          System.out.println("cuantas empresas quieres ingresar?");
          numEmpresas = scanner.nextInt();
        } while (numEmpresas <= 0 || numEmpresas > 10);

        for (int i = 0; i < numEmpresas; i++) {
          System.out.println("sectores [1-n]:");
          for (int j = 0; j < sectores.length; j++) {
            if (sectores[j] == null) {
              break;
            }
            System.out.print((j + 1) + ": " + (sectores[j].getNombre()) + " ");
          }
          System.out.println(" ");
          System.out.println(
              "ingrese el numero del sector al que pertenece la empresa:");
          int numSectorEmpresa = scanner.nextInt() - 1;
          System.out.println("Ingrese el nombre de la empresa:");
          String nombreEmpresa = scanner.next();
          System.out.println("Ingrese la categoría de la empresa:");
          String categoriaEmpresa = scanner.next();
          System.out.println("Ingrese el precio actual de la empresa:");
          double precioActual = scanner.nextDouble();
          System.out.println("Ingrese el precio mínimo de la empresa:");
          double precioMin = scanner.nextDouble();
          System.out.println("Ingrese el precio máximo de la empresa:");
          double precioMax = scanner.nextDouble();
          Empresa empresa = new Empresa(nombreEmpresa, categoriaEmpresa,
                                        precioActual, precioMin, precioMax);
          empresas[i] = empresa;
          sectores[numSectorEmpresa].agregarEmpresa(empresa);
        }

        break;
      case 3:
        clientes = new Cliente[10];
        int numClientes = 0;

        do {
          System.out.println("cuantos clientes quieres ingresar?");
          numClientes = scanner.nextInt();
        } while (numClientes <= 0 || numClientes > 10);

        for (int i = 0; i < numClientes; i++) {
          System.out.println("Ingrese el nombre del cliente:");
          String nombreCliente = scanner.next();
          Cliente cliente = new Cliente(nombreCliente);
          clientes[i] = cliente;
        }
        break;
      case 4:

        // if (clientes == null) {
        //   System.out.println("no hay clientes disponibles");
        //   break;
        // }

        System.out.println("clientes [1-n]:");

        for (int i = 0; i < clientes.length; i++) {
          if (clientes[i] == null) {
            break;
          }
          System.out.print((i + 1) + ": " + (clientes[i].getNombre()) + " ");
        }

        System.out.println(" ");
        System.out.println(
            "ingrese el numero del cliente para crear la orden:");
        int numClienteOrden = scanner.nextInt() - 1;

        System.out.println("empresas [1-n]:");
        for (int i = 0; i < empresas.length; i++) {
          if (empresas[i] == null) {
            break;
          }
          System.out.print((i + 1) + ": " + (empresas[i].getNombre()) + " ");
        }
        System.out.println(" ");
        System.out.println(
            "ingrese el numero de la empresa para crear la orden:");
        int numEmpresaOrden = scanner.nextInt() - 1;

        System.out.println("Ingrese el tipo de orden (compra/venta):");
        String tipoOrden = scanner.next();
        System.out.println("Ingrese la cantidad de acciones:");
        double cantidadOrden = scanner.nextDouble();
        System.out.println("Ingrese el precio objetivo:");
        double precioObjetivoOrden = scanner.nextDouble();

        clientes[numClienteOrden].agregarOrden(
            (Empresa)empresas[numEmpresaOrden], tipoOrden, cantidadOrden,
            precioObjetivoOrden);

        break;
      case 5:
        if (sectores == null) {
          System.out.println("no hay sectores disponibles");
          break;
        }
        System.out.println("sectores [1-n]:");
        for (int i = 0; i < sectores.length; i++) {
          if (sectores[i] == null) {
            break;
          }
          System.out.print((i + 1) + ": " + (sectores[i].getNombre()) + " ");
        }
        System.out.println(" ");
        System.out.println(
            "ingrese el numero del sector para calcular la diferencia:");
        int numSectorDiferencia = scanner.nextInt() - 1;
        sectores[numSectorDiferencia].calcularDiferencia();
        break;
      case 6:

        if (sectores == null) {
          System.out.println("no hay sectores disponibles");
          break;
        }
        for (Sector sector : sectores) {
          if (sector != null) {
            sector.calcularDiferencia();
          }
        }
        break;
      case 7:

        if (empresas == null) {
          System.out.println("no hay empresas disponibles");
          break;
        }
        System.out.println("empresas [1-n]:");
        for (int i = 0; i < empresas.length; i++) {
          if (empresas[i] == null) {
            break;
          }
          System.out.print((i + 1) + ": " + (empresas[i].getNombre()) + " ");
        }
        System.out.println(" ");
        System.out.println(
            "ingrese el numero de la empresa para calcular la diferencia:");
        int numEmpresaDiferencia = scanner.nextInt() - 1;
        empresas[numEmpresaDiferencia].calcularDiferencia();

        break;
      case 8:
        if (empresas == null) {
          System.out.println("no hay empresas disponibles");
          break;
        }
        System.out.println("empresas [1-n]:");
        for (int i = 0; i < empresas.length; i++) {
          if (empresas[i] == null) {
            break;
          }
          System.out.print((i + 1) + ": " + (empresas[i].getNombre()) + " ");
        }
        System.out.println(" ");
        System.out.println("ingrese el numero de la empresa para calcular los "
                           + "valores de n acciones:");
        int numEmpresaValores = scanner.nextInt() - 1;
        System.out.println("Ingrese la cantidad de acciones:");
        int cantidadValores = scanner.nextInt();
        empresas[numEmpresaValores].calcularValorAcciones(cantidadValores);
        break;
      case 9:
        if (sectores == null) {
          System.out.println("no hay sectores disponibles");
          break;
        }
        System.out.println("sectores [1-n]:");
        for (int i = 0; i < sectores.length; i++) {
          if (sectores[i] == null) {
            break;
          }
          System.out.print((i + 1) + ": " + (sectores[i].getNombre()) + " ");
        }
        System.out.println(" ");
        System.out.println(
            "ingrese el numero del sector para calcular el indice:");
        int numSectorIndice = scanner.nextInt() - 1;
        System.out.println(
            "El índice del sector " + sectores[numSectorIndice].getNombre() +
            " es: " + sectores[numSectorIndice].calcularIndice());
        break;
      default:
        System.out.println("opcion no valida");
        break;
      }
    }
    scanner.close();
  }
}
