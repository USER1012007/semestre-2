public class Main {
  public static void main(String[] args) {
    edificio[] construcciones = new edificio[5];

    construcciones[0] = new polideportivo("poli 1", 2500.50, 1);
    construcciones[1] = new polideportivo("poli 2", 1200.0, 2);
    construcciones[2] = new polideportivo("poli 3", 3100.25, 1);

    construcciones[3] = new edificioOficinas(500.0, 15);
    construcciones[4] = new edificioOficinas(1200.0, 40);

    for (edificio e : construcciones) {
      System.out.println(e.toString());
    }
  }
}
