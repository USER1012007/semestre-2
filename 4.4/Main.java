public class Main {
  public static void main(String[] args) {

    dc flash = new dc("flash", "identidad", "humano", "velocidad", "traje", 5);
    flash.Pelear(flash.nivel, flash.tipo_poder);
    marvel iron =
        new marvel("iron man", "identidad", "humano", "traje", "traje", 4);
    flash.Pelear(flash.nivel, flash.tipo_poder);
  }
}
