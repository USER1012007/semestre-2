public class aplicacion {
  public static void main(String[] args) {
    camion cam = new camion();
    cam.setMarca("Scania");
    cam.setPatente("ABC123");
    cam.setcarga(5000);

    autobus bus = new autobus();
    bus.setMarca("Mercedes");
    bus.setPatente("XYZ789");
    bus.setAsientos(50);

    System.out.println("Camion: " + cam.getMarca() + " " + cam.getPatente() +
                       " Carga: " + cam.getcarga() + " kg");
    System.out.println("Autobus: " + bus.getMarca() + " " + bus.getPatente() +
                       " Asientos: " + bus.getAsientos());

    camionConCompartimientos camCompart = new camionConCompartimientos();
    camCompart.setMarca("Volvo");
    camCompart.setPatente("DEF456");
    camCompart.setcarga(6000);
    camCompart.setCompartimientos(3);
    System.out.println(camCompart.getCompartimientos());
    System.out.println(camCompart.descripcion());
  }
}
