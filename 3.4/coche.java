public class coche extends personas {

  @Override
  public double getPrecio() {
    return precioBase += 1.5;
  }
}
