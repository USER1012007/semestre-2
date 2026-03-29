public class microbuses extends personas {
  @Override
  public double getPrecio() {
    return precioBase += 2;
  }
}
