public class Main {
  public static void main(String[] args) {
    Curso curso1 = new Curso("Java", 40, 15.0);
    CursoCertificado curso2 = new CursoCertificado();

    curso2.nombre = "C++ :)";
    curso2.duracionHoras = 30;
    curso2.precio = 200.0;
    curso2.institucion = "ITQsito";
    curso2.incluyeCertificado = true;

    System.out.println("curso 1:");
    curso1.mostrarInformacion();
    System.out.println("costo curso 1: $" + curso1.calcularCosto());

    System.out.println("\ninfo curso 2:");
    curso2.mostrarInformacion();
    System.out.println("costo curso 2: $" + curso2.calcularCosto());
    curso2.emitirCertificado();
  }
}
