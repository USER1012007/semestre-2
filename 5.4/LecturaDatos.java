import java.io.*;
public class LecturaDatos {
  public static void main(String[] args) throws IOException {
    DataInputStream ds = new DataInputStream(new FileInputStream("datos.dat"));
    try {
      for (;;) {
        System.out.println(ds.readInt());
      }
    } catch (EOFException e) {
      System.out.println("no hay mas datos");
    }
  }
}
