public class pedidos {
  String plato1;
  String plato2;
  String bebida;
  String postre;

  public pedidos(String plato1) {
    this.plato1 = plato1;
    this.plato2 = "";
    this.bebida = "";
    this.postre = "";
  }

  public pedidos(String plato1, String plato2) {
    this.plato1 = plato1;
    this.plato2 = plato2;
    this.bebida = "";
    this.postre = "";
  }

  public pedidos(String plato1, String plato2, String bebida, String postre) {
    this.plato1 = plato1;
    this.plato2 = plato2;
    this.bebida = bebida;
    this.postre = postre;
  }

  public pedidos(String plato1, String bebida, boolean tieneBebida) {
    this.plato1 = plato1;
    this.plato2 = "";
    this.bebida = bebida;
    this.postre = "";
  }

  public pedidos(String plato1, String bebida, String postre) {
    this.plato1 = plato1;
    this.plato2 = "";
    this.bebida = bebida;
    this.postre = postre;
  }

  public void mostrar() {
    System.out.println("plato1: " + plato1);
    System.out.println("plato2: " + plato2);
    System.out.println("bebida: " + bebida);
    System.out.println("postre: " + postre);
  }
}
