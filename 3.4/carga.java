public class carga extends vehiculo {
  public double PMA = 0.0;

  @Override
  public double getPrecio() {
    return precioBase += 20 * PMA;
  }

  public double getPMA() { return PMA; }

  public void setPMA(double pMA) { PMA = pMA; }
}
