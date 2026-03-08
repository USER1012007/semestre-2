public class Persona {
  private String nombre = "";
  private int edad = 0;
  private char genero = 'H';
  private double altura = 0.0;
  private double peso = 0.0;
  private String dni = "";

  public Persona() {}

  public Persona(String nombre, int edad, char genero) {
    this.nombre = nombre;
    this.edad = edad;
    this.genero = genero;
    this.altura = 0.0;
    this.peso = 0.0;
    this.dni = "";
  }

  public Persona(String nombre, int edad, char genero, double altura,
                 double peso) {
    this.nombre = nombre;
    this.edad = edad;
    this.genero = genero;
    this.altura = altura;
    this.peso = peso;
  }

  public int calcularIMC() {
    double imc = peso / (altura * altura);
    if (imc < 18.5) {
      return -1;
    } else if (imc >= 18.5 && imc < 25) {
      return 0;
    } else {
      return 1;
    }
  }

  public boolean esMayorDeEdad() { return edad >= 18; }

  public String toString() {
    return "Nombre: " + nombre + "\nEdad: " + edad + "\nGénero: " + genero +
        "\nAltura: " + altura + " m\nPeso: " + peso + " kg\nDNI: " + dni;
  }

  public char comprobarGenero(char genero) {
    if (genero == 'H' || genero == 'M') {
      return genero;
    } else {
      return 'H';
    }
  }

  public void generarDNI() {
    String numeros = "0123456789";
    String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
    StringBuilder dniBuilder = new StringBuilder();
    for (int i = 0; i < 8; i++) {
      int index = (int)(Math.random() * numeros.length());
      dniBuilder.append(numeros.charAt(index));
    }
    int numeroDNI = Integer.parseInt(dniBuilder.toString());
    char letraDNI = letras.charAt(numeroDNI % 23);
    this.dni = dniBuilder.toString() + letraDNI;
  }

  public void setNombre(String nombre) { this.nombre = nombre; }

  public void setEdad(int edad) { this.edad = edad; }

  public void setGenero(char genero) { this.genero = genero; }

  public void setAltura(double altura) { this.altura = altura; }

  public void setPeso(double peso) { this.peso = peso; }
}
