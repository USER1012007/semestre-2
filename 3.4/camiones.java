public class camiones extends carga {
  @Override
  public double getPrecio() {
    return precioBase += 40;
  }
}
