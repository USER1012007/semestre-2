import java.io.*;

public class Lectura {
  public static void main(String[] args) throws IOException {
    File f = new File("datos.txt");
    if (f.exists()) {
      FileReader fr = new FileReader("datos.txt");
      BufferedReader bf = new BufferedReader(fr);
      String cad;
      while ((cad = bf.readLine()) != null) {
        System.out.println(cad);
      }
    } else {
      System.out.println("el archivo "
                         + " no Existe");
    }
  }
}
