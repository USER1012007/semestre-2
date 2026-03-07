import java.util.Scanner;

public class main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    Persona[] lasPersonas = new Persona[10];
    Persona pers1 = new Persona("Luis");
    lasPersonas[4] = pers1;
    System.out.println(lasPersonas[4].getNombre());

    System.out.println("ingresa cantidad de personas:");
    int cant = scanner.nextInt();

    Persona[] persona = new Persona[cant];
    for (int i = 0; i < cant; i++) {
      persona[i] = new Persona();

      System.out.println("ingresa nombre:");
      persona[i].setNombre(scanner.next());

      System.out.println("ingresa edad:");
      persona[i].setEdad(scanner.nextInt());

      System.out.println("ingresa estatura:");
      persona[i].setEstatura(scanner.nextFloat());

      System.out.println("ingresa salario:");
      persona[i].setSalario(scanner.nextDouble());
    }

    for (int i = 0; i < cant; i++) {
      System.out.println("nombre: " + persona[i].getNombre());
      System.out.println("edad: " + persona[i].getEdad());
      System.out.println("estatura: " + persona[i].getEstatura());
      System.out.println("salario: " + persona[i].getSalario());
    }

    scanner.close();
  }
}
