public class protegido extends parque implements visible {

  double subvencion;

  public protegido(int kms, int num_especies, String nombre,
                   double subvencion) {
    super(kms, num_especies, nombre);
    this.subvencion = subvencion;
  }

  public double getSubvencion() { return subvencion; }

  public void setSubvencion(double subvencion) { this.subvencion = subvencion; }

  @Override
  public String visitar(String nombre) {
    return nombre;
  }
}
