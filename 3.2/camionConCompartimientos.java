public class camionConCompartimientos extends camion {

  public int compartimientos = 1;

  public void setCompartimientos(int compartimientos) {
    this.compartimientos = compartimientos;
  }
  public int getCompartimientos() { return compartimientos; }

  public int CargaCompartimientos() { return getcarga() / compartimientos; }
  public String descripcion() { return marca + compartimientos; }
}
