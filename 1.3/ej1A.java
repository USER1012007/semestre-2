import javax.swing.JOptionPane;

public class ej1A {

  public static void main(String[] args) {

    int numero =
        Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
    int numero2 =
        Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));

    JOptionPane.showMessageDialog(null, "La suma es: " + (numero + numero2));
  }
}
