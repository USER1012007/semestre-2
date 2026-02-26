public class animales {
  private String nombre;
  private String especie;
  private String color;
  private Double peso;
  private String habitat;

  public animales(String nombre, String especie, String color, Double peso,
                  String habitat) {
    this.nombre = nombre;
    this.especie = especie;
    this.color = color;
    this.peso = peso;
    this.habitat = habitat;
  }
  public animales(String nombre, String especie, String color) {
    this.nombre = nombre;
    this.especie = especie;
    this.color = color;
  }
  public String getNombre() { return nombre; }
  public void setNombre(String nombre) { this.nombre = nombre; }
  public String getEspecie() { return especie; }
  public void setEspecie(String especie) { this.especie = especie; }
  public String getColor() { return color; }
  public void setColor(String color) { this.color = color; }
  public Double getPeso() { return peso; }
  public void setPeso(Double peso) { this.peso = peso; }
  public String getHabitat() { return habitat; }
  public void setHabitat(String habitat) { this.habitat = habitat; }
}
