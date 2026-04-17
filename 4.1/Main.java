public class Main {
  public static void main(String[] args) {

    Empleado[] empleados = new Empleado[4];

    empleados[0] = new EmpleadoTiempoCompleto("Ana", 12000, "Tiempo Completo");
    empleados[1] = new EmpleadoPorHoras("Luis", 40, 100, "Por horas");
    empleados[2] =
        new EmpleadoComisionista("Carlos", 5000, 20000, 0.1, "Comisionista");
    empleados[3] = new EmpleadoFreelancer("Juan", 50000, 3, "Freelancer");

    for (Empleado e : empleados) {
      e.mostrarDatos();
      e.tipoEmpleado();
      System.out.println("Salario: " + e.calcularSalario());
    }
  }
}
