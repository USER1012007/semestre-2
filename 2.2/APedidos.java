public class APedidos {

  public static void main(String[] args) {

    pedidos pedido1 = new pedidos("tacos");
    pedidos pedido2 = new pedidos("tacos", "enchiladas");
    pedidos pedido3 = new pedidos("tacos", "enchiladas", "coca-cola", "flan");
    pedidos pedido4 = new pedidos("tacos", "coca-cola", true);
    pedidos pedido5 = new pedidos("tacos", "coca-cola", "flan");

    System.out.println("pedido 1:");
    pedido1.mostrar();

    System.out.println("\npedido 2:");
    pedido2.mostrar();

    System.out.println("\npedido 3:");
    pedido3.mostrar();

    System.out.println("\npedido 4:");
    pedido4.mostrar();

    System.out.println("\npedido 5:");
    pedido5.mostrar();
  }
}
