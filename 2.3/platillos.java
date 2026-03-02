public class platillos {
  String nombre;
  String color;
  int cantidad;

  public platillos(int cantidad, String nombre, String color) {
    this.cantidad = cantidad;
    this.nombre = nombre;
    this.color = color;
  }
  public platillos(int cantidad) {
    this.cantidad = cantidad;
    this.nombre = "desconocido";
    this.color = "desconocido";
  }
  public platillos(String nombre, String color) {
    this.cantidad = 0;
    this.nombre = nombre;
    this.color = color;
  }

  public void mostrar() {
    System.out.println("Nombre: " + nombre);
    System.out.println("Color: " + color);
    System.out.println("Cantidad: " + cantidad);
  }

  public static void main(String[] args) {

    platillos platillo1 = new platillos(5, "Tacos", "Verde");
    platillos platillo2 = new platillos(10);
    platillos platillo3 = new platillos("Enchiladas", "Rojo");

    System.out.println("Platillo 1:");
    platillo1.mostrar();

    System.out.println("\nPlatillo 2:");
    platillo2.mostrar();

    System.out.println("\nPlatillo 3:");
    platillo3.mostrar();
  }
}
