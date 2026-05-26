import java.io.*;
import java.util.Scanner;

public class GestorReportes {

  static final int MAX_REPORTES = 10;
  static ReporteMantenimiento[] reportes =
      new ReporteMantenimiento[MAX_REPORTES];
  static int contador = 0;

  public static void agregarReporte(Scanner sc) {
    if (contador >= MAX_REPORTES) {
      System.out.println("Se alcanzó el límite de reportes.");
      return;
    }
    try {
      System.out.print("ID: ");
      int id = Integer.parseInt(sc.nextLine());
      System.out.print("Nombre del técnico: ");
      String tecnico = sc.nextLine();
      System.out.print("Fecha (dd/mm/aaaa): ");
      String fecha = sc.nextLine();
      System.out.print("Descripción del problema: ");
      String descripcion = sc.nextLine();
      System.out.print("Solución aplicada: ");
      String solucion = sc.nextLine();
      System.out.print("Costo estimado: ");
      double costo = Double.parseDouble(sc.nextLine());
      reportes[contador++] = new ReporteMantenimiento(
          id, tecnico, fecha, descripcion, solucion, costo);
      System.out.println(" Reporte agregado correctamente.");
    } catch (NumberFormatException e) {
      System.out.println(
          " Error: Entrada numérica no válida. Intenta de nuevo.");
    } catch (IllegalArgumentException e) {
      System.out.println(" " + e.getMessage());
    }
  }

  public static void exportarTexto(String archivo) {
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo))) {
      for (int i = 0; i < contador; i++) {
        writer.write(reportes[i].toString());
        writer.newLine();
      }
      System.out.println("Archivo de texto generado.");
    } catch (IOException e) {
      System.out.println(" Error al exportar: " + e.getMessage());
    }
  }

  public static void guardarBinario(String archivo) {
    try (ObjectOutputStream out =
             new ObjectOutputStream(new FileOutputStream(archivo))) {
      out.writeInt(contador);
      for (int i = 0; i < contador; i++) {
        out.writeObject(reportes[i]);
      }
      System.out.println("Reportes guardados correctamente.");

    } catch (IOException e) {
      System.out.println("Error al guardar: " + e.getMessage());
    }
  }

  public static void leerBinario(String archivo) {
    try (ObjectInputStream in =
             new ObjectInputStream(new FileInputStream(archivo))) {
      contador = in.readInt();
      for (int i = 0; i < contador; i++) {
        reportes[i] = (ReporteMantenimiento)in.readObject();
      }
      System.out.println("Reportes leídos correctamente.");

    } catch (IOException | ClassNotFoundException e) {
      System.out.println("Error al leer: " + e.getMessage());
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int opcion;
    do {
      System.out.println("\n--- Menú ---");
      System.out.println("1. Agregar reporte");
      System.out.println("2. Guardar en archivo binario");
      System.out.println("3. Leer desde archivo binario");
      System.out.println("4. Exportar a archivo de texto");
      System.out.println("5. Salir");
      System.out.print("Opción: ");
      opcion = sc.nextInt();
      sc.nextLine();
      switch (opcion) {
      case 1:
        agregarReporte(sc);
        break;
      case 2:
        guardarBinario("reportes.dat");
        break;
      case 3:
        leerBinario("reportes.dat");
        break;
      case 4:
        exportarTexto("reporte.txt");
        break;
      case 5:
        System.out.println("Programa finalizado.");
        break;
      default:
        System.out.println("Opción inválida.");
        break;
      }
    } while (opcion != 5);
    sc.close();
  }
}
