class EmpleadoComisionista extends Empleado {
  double salarioBase;
  double ventas;
  double porcentaje;
  String tipo;

  EmpleadoComisionista(String nombre, double salarioBase, double ventas,
                       double porcentaje, String tipo) {
    super(nombre, tipo);
    this.salarioBase = salarioBase;
    this.ventas = ventas;
    this.porcentaje = porcentaje;
  }

  @Override
  double calcularSalario() {
    return salarioBase + (ventas * porcentaje);
  }
}
