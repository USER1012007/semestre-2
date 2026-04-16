public class Main {
  public static void main(String[] args) {
    Circulo circulo = new Circulo(0, 0, 5);
    Rectangulo rectangulo = new Rectangulo(0, 0, 4, 6);

    System.out.println("Área del círculo: " + circulo.area());
    System.out.println("Área del rectángulo: " + rectangulo.area());
  }
}
