public class parque {

  int kms;
  int num_especies;
  String nombre;

  public parque(int kms, int num_especies, String nombre) {
    this.kms = kms;
    this.num_especies = num_especies;
    this.nombre = nombre;
  }
  public int getKms() { return kms; }
  public void setKms(int kms) { this.kms = kms; }
  public int getNum_especies() { return num_especies; }
  public void setNum_especies(int num_especies) {
    this.num_especies = num_especies;
  }
  public String getNombre() { return nombre; }
  public void setNombre(String nombre) { this.nombre = nombre; }
}
