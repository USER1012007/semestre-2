abstract class SeleccionFutbol implements IntegranteSeleccionFutbol {
  int id;
  String nombre;
  String apellidos;
  int edad;

  public SeleccionFutbol(int id, String nombre, String apellidos, int edad) {
    this.id = id;
    this.nombre = nombre;
    this.apellidos = apellidos;
    this.edad = edad;
  }
  @Override
  public void concentrarse() {
    System.out.println("concentrado");
  }
  public void entrenar() { System.out.println("entrenando"); }
  public void jugarPartido() { System.out.println("jugando"); }
  public void viajar() { System.out.println("viajando"); }
}
