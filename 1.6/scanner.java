import java.util.Scanner;

public class scanner {
  public static void main(String[] args) {

    int op = 0;
    double num1 = 0, num2 = 0;
    double a = 0;
    Scanner sc = new Scanner(System.in);

    while (op != 6) {

      System.out.println("Volumenes\n1. Esfera\n2. Cubo\n3. Piramide\n4. "
                         + "Cono\n5. Ortohedro\n6. salir ");
      op = Integer.parseInt(sc.nextLine());

      switch (op) {
      case 1:
        System.out.println("Ingrese el radio de la esfera");
        num1 = Double.parseDouble(sc.nextLine());
        a = 4 * Math.PI * Math.pow(num1, 3) / 3;
        System.out.println("El area de la esfera es: " + a);

        break;
      case 2:
        System.out.println("Ingrese el lado del cubo");
        num1 = Double.parseDouble(sc.nextLine());
        a = Math.pow(num1, 3);
        System.out.println("El area del cubo es: " + a);
        break;
      case 3:
        System.out.println("Ingrese el area de la base de la piramide");
        num1 = Double.parseDouble(sc.nextLine());
        System.out.println("Ingrese la altura de la piramide");
        num2 = Double.parseDouble(sc.nextLine());
        a = num1 * num2 / 3;
        System.out.println("El area de la piramide es: " + a);
        break;
      case 4:
        System.out.println("Ingrese el radio del cono");
        num1 = Double.parseDouble(sc.nextLine());
        System.out.println("Ingrese la altura del cono");
        num2 = Double.parseDouble(sc.nextLine());
        a = Math.PI * Math.pow(num1, 2) * num2 / 3;
        System.out.println("El area del cono es: " + a);
        break;
      case 5:
        System.out.println("Ingrese el largo del ortohedro");
        num1 = Double.parseDouble(sc.nextLine());
        System.out.println("Ingrese el ancho del ortohedro");
        num2 = Double.parseDouble(sc.nextLine());
        System.out.println("Ingrese la altura del ortohedro");
        double num3 = Double.parseDouble(sc.nextLine());
        a = num1 * num2 * num3;
        System.out.println("El area del ortohedro es: " + a);

        break;
      default:
        System.out.println("bye bye.");
        break;
      }
    }
    sc.close();
  }
}
