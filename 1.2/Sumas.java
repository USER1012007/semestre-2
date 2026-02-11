import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Sumas {
  public static void main(String[] args) {

    double a = 0.0;
    double b = 0.0;

    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

    try {

      System.out.println("ingresa a: ");
      System.out.flush();
      a = Double.parseDouble(br.readLine());

      System.out.println("ingresa b: ");
      System.out.flush();
      b = Double.parseDouble(br.readLine());

      System.out.println(a + " + " + b + " = " + (a + b));
    } catch (Exception e) {
      System.out.println("Error: " + e.getMessage());
    }
  }
}
