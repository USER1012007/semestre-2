public class vehiculo {

  public String matricula;
  public int diasAlquiler;
  public double precioBase = 50;
  public double precioTotal;

  public String getMatricula() { return matricula; }

  public void setMatricula(String matricula) { this.matricula = matricula; }

  public int getDiasAlquiler() { return diasAlquiler; }

  public void setDiasAlquiler(int diasAlquiler) {
    this.diasAlquiler = diasAlquiler;
  }

  public double getPrecioAlquiler() { return precioBase; }

  public void setPrecioAlquiler(double precioBase, int diasAlquiler) {
    this.precioBase = precioBase * diasAlquiler;
  }

  public double getPrecio() { return precioBase; }

  public void setPrecio(double precioBase) { this.precioBase = precioBase; }

  public double getPrecioTotal() { return precioTotal; }

  public void setPrecioTotal(double precioTotal) {
    this.precioTotal = precioTotal;
  }
}
