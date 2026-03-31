public class Curso {
  String nombre;
  int duracionHoras;
  double precio;

  public Curso() {}

  public Curso(String nombre, int duracionHoras) {
    this.nombre = nombre;
    this.duracionHoras = duracionHoras;
  }

  public Curso(String nombre, int duracionHoras, double precio) {
    this.nombre = nombre;
    this.duracionHoras = duracionHoras;
    this.precio = precio;
  }

  public void mostrarInformacion() {
    System.out.println("Curso: " + nombre);
    System.out.println("Duración: " + duracionHoras + " horas");
    System.out.println("Precio: $" + precio);
  }

  public double calcularCosto() { return duracionHoras * precio; }
}
