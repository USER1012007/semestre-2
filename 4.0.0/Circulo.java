public class Circulo extends Figura {
  protected int radio;

  public Circulo(int x, int y, int radio) {
    super(x, y);
    this.radio = radio;
  }

  @Override
  public double area() {
    return Math.PI * radio * radio;
  }
}
