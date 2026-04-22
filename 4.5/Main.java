public class Main {
  public static void main(String[] args) {
    Futbolista fut1 = new Futbolista(1, "fut1", "lastFut", 40, 10, "si");

    fut1.entrenar();
    fut1.jugarPartido();
    fut1.concentrarse();
    fut1.viajar();

    SeleccionFutbol fut2 = new Futbolista(2, "oifj", "apellido", 20, 10, "i");
    fut2.entrenar();
    fut2.jugarPartido();
    fut2.concentrarse();
    fut2.viajar();

    Masajista masaje = new Masajista("si", 10);
    masaje.darMasaje();
  }
}
