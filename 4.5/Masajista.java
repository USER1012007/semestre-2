public class Masajista {

  String titulacion;
  int experiencia;

  public void darMasaje() { System.out.println("Masajeando"); }

  public int getExperiencia() { return experiencia; }

  public void setExperiencia(int experiencia) {
    this.experiencia = experiencia;
  }

  public Masajista(String titulacion, int experiencia) {
    this.titulacion = titulacion;
    this.experiencia = experiencia;
  }
}
