public class Futbolista
    extends SeleccionFutbol implements IntegranteSeleccionFutbol {

  int dorsal;
  String demarcacion;
  public int getDorsal() { return dorsal; }
  public void setDorsal(int dorsal) { this.dorsal = dorsal; }
  public String getDemarcacion() { return demarcacion; }
  public void setDemarcacion(String demarcacion) {
    this.demarcacion = demarcacion;
  }

  public Futbolista(int id, String nombre, String apellidos, int edad,
                    int dorsal, String demarcacion) {
    super(id, nombre, apellidos, edad);
    this.dorsal = dorsal;
    this.demarcacion = demarcacion;
  }

  @Override
  public void concentrarse() {
    System.out.println("concentrado");
  }
  public void entrenar() { System.out.println("entrenando"); }
  public void jugarPartido() { System.out.println("jugando"); }
  public void viajar() { System.out.println("viajando"); }
}
