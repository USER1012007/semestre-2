import java.util.Scanner;

public class main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    animales animal = new animales("", "", "", 0.0, "");

    System.out.println("Ingrese el nombre del animal:");
    animal.setNombre(scanner.nextLine());
    System.out.println("Ingrese la especie del animal:");
    animal.setEspecie(scanner.nextLine());
    System.out.println("Ingrese el color del animal:");
    animal.setColor(scanner.nextLine());
    System.out.println("Ingrese el peso del animal:");
    animal.setPeso(Double.parseDouble(scanner.nextLine()));

    System.out.println("Ingrese el habitat del animal:");
    animal.setHabitat(scanner.nextLine());

    System.out.println("Animal creado: " + animal.getNombre() + ", " +
                       animal.getEspecie() + ", " + animal.getColor() + ", " +
                       animal.getPeso() + ", " + animal.getHabitat());

    scanner.close();
  }
}
