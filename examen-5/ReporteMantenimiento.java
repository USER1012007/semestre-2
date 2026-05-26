import java.io.*;
import java.util.Scanner;

class ReporteMantenimiento implements Serializable {
  private static final long serialVersionUID = 1L;
  private int id;
  private String tecnico;
  private String fecha;
  private String descripcion;
  private String solucion;
  private double costo;

  public ReporteMantenimiento(int id, String tecnico, String fecha,
                              String descripcion, String solucion,
                              double costo) {
    if (costo < 0) {
      throw new IllegalArgumentException("El costo no puede ser negativo.");
    }
    this.id = id;
    this.tecnico = tecnico;
    this.fecha = fecha;
    this.descripcion = descripcion;
    this.solucion = solucion;
    this.costo = costo;
  }

  public void setCosto(double costo) {
    if (costo < 0) {
      throw new IllegalArgumentException("El costo no puede ser negativo.");
    }
    this.costo = costo;
  }

  @Override
  public String toString() {
    return "ID: " + id + "\nTécnico: " + tecnico + "\nFecha: " + fecha +
        "\nDescripción: " + descripcion + "\nSolución: " + solucion +
        "\nCosto: $" + costo + "\n--------------------------";
  }
}
