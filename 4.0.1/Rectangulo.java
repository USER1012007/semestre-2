public class Rectangulo extends Figura implements calcular_area {
  private double ancho, alto;

  public Rectangulo(int x, int y, double ancho, double alto) {
    super(x, y);
    this.ancho = ancho;
    this.alto = alto;
  }

  @Override
  public double area() {
    return ancho * alto;
  }
}
