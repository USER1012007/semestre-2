class polideportivo implements deportivo, edificio {
  private String nombre;
  private double superficie;
  private int tipo;

  public polideportivo(String nombre, double superficie, int tipo) {
    this.nombre = nombre;
    this.superficie = superficie;
    this.tipo = tipo;
  }

  @Override
  public int getTipoDeInstalacion() {
    return tipo;
  }

  @Override
  public double getSuperficieEdificio() {
    return superficie;
  }

  @Override
  public String toString() {
    return "polideportivo: Nombre: " + nombre + ", juperficie: " + superficie +
        "m^2, tipo: " + tipo + "]";
  }
}
