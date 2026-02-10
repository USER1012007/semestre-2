import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) {

    String name = "";
    String age = "";

    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

    try {
      System.out.println("ingresa el nombre: ");
      System.out.flush();
      name = br.readLine();

      System.out.println("ingresa la edad: ");
      age = br.readLine();

      System.out.println("Hola " + name + " tu edad es: " + age);
    } catch (Exception e) {
      System.out.println("Error: " + e.getMessage());
    }
  }
}
