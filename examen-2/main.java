import java.util.Scanner;

public class main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Ingrese el nombre: ");
    String nombre = scanner.nextLine();
    System.out.print("Ingrese la edad: ");
    int edad = scanner.nextInt();
    System.out.print("Ingrese el género (H/M): ");
    char genero = scanner.next().charAt(0);
    System.out.print("Ingrese la altura en metros: ");
    double altura = scanner.nextDouble();
    System.out.print("Ingrese el peso en kg: ");
    double peso = scanner.nextDouble();

    Persona persona = new Persona(nombre, edad, genero, altura, peso);
    persona.generarDNI();

    Persona persona2 = new Persona(nombre, edad, genero);
    Persona persona3 = new Persona();

    persona3.setNombre("Sargento favian");
    persona3.setEdad(25);
    persona3.setGenero('H');
    persona3.setAltura(1.75);
    persona3.setPeso(80.0);
    persona3.generarDNI();

    System.out.println("\npersona 1:");
    System.out.println("IMC: " + persona.calcularIMC());
    System.out.println("mayor de edad: " + persona.esMayorDeEdad());
    System.out.println("informacion: \n" + persona.toString());

    System.out.println("\npersona 2:");
    System.out.println("IMC: " + persona2.calcularIMC());
    System.out.println("mayor de edad: " + persona2.esMayorDeEdad());
    System.out.println("informacion: " + persona2.toString());

    System.out.println("\npersona 3:");
    System.out.println("IMC: " + persona3.calcularIMC());
    System.out.println("mayor de edad: " + persona3.esMayorDeEdad());
    System.out.println("informacion: " + persona3.toString());

    scanner.close();
  }
}
