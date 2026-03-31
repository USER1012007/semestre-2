public class Empresa extends Sector {
  String nombre = "";
  String categoria = "";
  double precioActual = 0.0;
  double precioMin = 0.0;
  double precioMax = 0.0;

  public Empresa(String nombre, String categoria, double precioActual,
                 double precioMin, double precioMax) {
    super(nombre);
    this.nombre = nombre;
    this.categoria = categoria;
    this.precioActual = precioActual;
    this.precioMin = precioMin;
    this.precioMax = precioMax;
  }

  public String getNombre() { return nombre; }
  public void setNombre(String nombre) { this.nombre = nombre; }
  public String getCategoria() { return categoria; }
  public void setCategoria(String categoria) { this.categoria = categoria; }
  public double getPrecioActual() { return precioActual; }
  public void setPrecioActual(double precioActual) {
    this.precioActual = precioActual;
  }
  public double getPrecioMin() { return precioMin; }
  public void setPrecioMin(double precioMin) { this.precioMin = precioMin; }
  public double getPrecioMax() { return precioMax; }
  public void setPrecioMax(double precioMax) { this.precioMax = precioMax; }

  @Override
  public void calcularDiferencia() {
    double diferencia = this.precioMax - this.precioMin;
    System.out.println("La diferencia entre el precio máximo y mínimo es: " +
                       diferencia);
  }
  public void calcularValorAcciones(int n) {
    double valorTotal = precioActual * n;
    System.out.println("El valor total de " + n +
                       " acciones es: " + valorTotal);
  }
}
