public class Rectangulo extends Figura {
  protected int ancho, alto;

  public Rectangulo(int x, int y, int ancho, int alto) {
    super(x, y);
    this.ancho = ancho;
    this.alto = alto;
  }

  @Override
  public double area() {
    return ancho * alto;
  }
}
