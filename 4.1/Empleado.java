abstract class Empleado {
  String nombre;
  String tipo;

  Empleado(String nombre) { this.nombre = nombre; }
  Empleado(String nombre, String tipo) {
    this.nombre = nombre;
    this.tipo = tipo;
  }

  abstract double calcularSalario();

  public void mostrarDatos() { System.out.println("Empleado: " + nombre); }
  public void tipoEmpleado() { System.out.println("Tipo: " + tipo); }
}
