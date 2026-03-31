public class AccionCliente extends Cliente {
  double cantidad;
  double precioCompra;
  Empresa empresa;

  public AccionCliente(String nombre, double cantidad, double precioCompra,
                       Empresa empresa) {
    super(nombre);
    this.cantidad = cantidad;
    this.precioCompra = precioCompra;
    this.empresa = empresa;
  }
  public double getCantidad() { return cantidad; }
  public void setCantidad(double cantidad) { this.cantidad = cantidad; }
  public double getPrecioCompra() { return precioCompra; }
  public void setPrecioCompra(double precioCompra) {
    this.precioCompra = precioCompra;
  }

  public Empresa getEmpresa() { return empresa; }
  public void setEmpresa(Empresa empresa) { this.empresa = empresa; }
}
