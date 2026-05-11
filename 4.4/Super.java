public abstract class Super implements inter {

  String nombre;
  String identidad;
  String es_extraterreste;
  String tipo_poder;
  String equipo;

  public Super(String nombre, String identidad, String es_extraterreste,
               String tipo_poder, String equipo) {
    this.nombre = nombre;
    this.identidad = identidad;
    this.es_extraterreste = es_extraterreste;
    this.tipo_poder = tipo_poder;
    this.equipo = equipo;
  }

  @Override
  public void Volar(String volar) {
    System.out.println("vuela asi: " + volar);
  }
}
