public class caza extends parque {
  double costo_licencia;
  String arma;

  public caza(int kms, int num_especies, String nombre, double costo_licencia,
              String arma) {
    super(kms, num_especies, nombre);
    this.costo_licencia = costo_licencia;
    this.arma = arma;
  }

  public double getCosto_licencia() { return costo_licencia; }
  public void setCosto_licencia(double costo_licencia) {
    this.costo_licencia = costo_licencia;
  }
  public String getArma() { return arma; }
  public void setArma(String arma) { this.arma = arma; }
}
