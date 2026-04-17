class EmpleadoPorHoras extends Empleado {
  int horas;
  double pagoPorHora;
  String tipo;

  EmpleadoPorHoras(String nombre, int horas, double pagoPorHora, String tipo) {
    super(nombre, tipo);
    this.horas = horas;
    this.pagoPorHora = pagoPorHora;
  }

  @Override
  double calcularSalario() {
    return horas * pagoPorHora;
  }
}
