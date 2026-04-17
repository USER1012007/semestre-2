public class EmpleadoFreelancer extends Empleado {
  double pagoPorProyecto;
  int proyectosCompletados;
  String tipo;

  EmpleadoFreelancer(String nombre, double pagoPorProyecto,
                     int proyectosCompletados, String tipo) {
    super(nombre, tipo);
    this.pagoPorProyecto = pagoPorProyecto;
    this.proyectosCompletados = proyectosCompletados;
  }

  @Override
  double calcularSalario() {
    return pagoPorProyecto * proyectosCompletados;
  }
}
