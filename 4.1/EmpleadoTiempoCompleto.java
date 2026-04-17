class EmpleadoTiempoCompleto extends Empleado {
  double salarioMensual;
  String tipo;

  EmpleadoTiempoCompleto(String nombre, double salarioMensual, String tipo) {
    super(nombre, tipo);
    this.salarioMensual = salarioMensual;
  }

  @Override
  double calcularSalario() {
    return salarioMensual;
  }
}
