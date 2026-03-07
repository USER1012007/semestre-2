public class Persona {

  String nombre = "";
  int edad = 0;
  float estatura = 0;
  double salario = 0.0;

  public Persona() {}
  public Persona(String nombre) { this.nombre = nombre; }

  public String getNombre() { return nombre; }
  public void setNombre(String nombre) { this.nombre = nombre; }
  public int getEdad() { return edad; }
  public void setEdad(int edad) { this.edad = edad; }
  public float getEstatura() { return estatura; }
  public void setEstatura(float estatura) { this.estatura = estatura; }
  public double getSalario() { return salario; }
  public void setSalario(double salario) { this.salario = salario; }
}
