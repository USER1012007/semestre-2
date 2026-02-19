import javax.swing.JOptionPane;

public class joption {
  public static void main(String[] args) {

    int op = 0;
    double num1 = 0, num2 = 0;
    double a = 0;

    while (op != 4) {

      op = Integer.parseInt(JOptionPane.showInputDialog(
          null, "1. Cuadrado\n2. Triangulo\n3. Circulo\n4. salir "));

      switch (op) {
      case 1:
        num1 =
            Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base:"));
        num2 = Double.parseDouble(
            JOptionPane.showInputDialog("Ingrese la altura:"));

        a = num1 * num2;
        JOptionPane.showMessageDialog(null, "El area es: " + a);
        break;
      case 2:
        num1 =
            Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base:"));
        num2 = Double.parseDouble(
            JOptionPane.showInputDialog("Ingrese la altura:"));

        a = (num1 * num2) / 2;
        JOptionPane.showMessageDialog(null, "El area es: " + a);
        break;
      case 3:
        num1 = Double.parseDouble(
            JOptionPane.showInputDialog("Ingrese el radio:"));

        a = (Math.PI * num1);
        JOptionPane.showMessageDialog(null, "El area es: " + a);
        break;
      default:
        break;
      }
    }
  }
}
