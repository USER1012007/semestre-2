public class marvel extends Super {

  int nivel;
  public marvel(String nombre, String identidad, String es_extraterreste,
                String tipo_poder, String equipo, int nivel) {
    super(nombre, identidad, es_extraterreste, tipo_poder, equipo);
    this.nivel = nivel;
  }

  @Override
  public void Pelear(int pelear, String tipo) {
    System.out.println("nivel pelea: " + pelear + " en " + tipo);
  }
}
