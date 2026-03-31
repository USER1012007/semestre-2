public class Orden extends Cliente {
  Empresa empresa;
  String tipo;
  double precioObjetivo;
  double cantidad;

  public Orden(Empresa empresa, String tipo, double precioObjetivo,
               double cantidad) {
    super("");
    this.empresa = empresa;
    this.tipo = tipo;
    this.precioObjetivo = precioObjetivo;
    this.cantidad = cantidad;
  }

  public Orden(double precioObjetivo) {
    super("");
    this.precioObjetivo = precioObjetivo;
  }

  public Orden(double precioObjetivo, double cantidad) {
    super("");
    this.precioObjetivo = precioObjetivo;
    this.cantidad = cantidad;
  }

  public Empresa getEmpresa() { return empresa; }
  public void setEmpresa(Empresa empresa) { this.empresa = empresa; }
  public String getTipo() { return tipo; }
  public void setTipo(String tipo) { this.tipo = tipo; }
  public double getPrecioObjetivo() { return precioObjetivo; }
  public void setPrecioObjetivo(double precioObjetivo) {
    this.precioObjetivo = precioObjetivo;
  }
  public double getCantidad() { return cantidad; }
  public void setCantidad(double cantidad) { this.cantidad = cantidad; }
}
