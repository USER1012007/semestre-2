public class terrestres extends protegido {
  String tipo_terreno;
  double extension;
  int num_especies_protegidas;
  String especies_protegidas;
  int poblacion;

  public terrestres(int kms, int num_especies, String nombre, double subvencion,
                    String tipo_terreno, double extension,
                    int num_especies_protegidas, String especies_protegidas,
                    int poblacion) {
    super(kms, num_especies, nombre, subvencion);
    this.tipo_terreno = tipo_terreno;
    this.extension = extension;
    this.num_especies_protegidas = num_especies_protegidas;
    this.especies_protegidas = especies_protegidas;
    this.poblacion = poblacion;
  }

  public String getTipo_terreno() { return tipo_terreno; }
  public void setTipo_terreno(String tipo_terreno) {
    this.tipo_terreno = tipo_terreno;
  }
  public double getExtension() { return extension; }
  public void setExtension(double extension) { this.extension = extension; }
  public int getNum_especies_protegidas() { return num_especies_protegidas; }
  public void setNum_especies_protegidas(int num_especies_protegidas) {
    this.num_especies_protegidas = num_especies_protegidas;
  }
  public String getEspecies_protegidas() { return especies_protegidas; }
  public void setEspecies_protegidas(String especies_protegidas) {
    this.especies_protegidas = especies_protegidas;
  }
  public int getPoblacion() { return poblacion; }
  public void setPoblacion(int poblacion) { this.poblacion = poblacion; }
}
