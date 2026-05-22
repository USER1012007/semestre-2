import java.io.*;
public class GrabArray {
  public static void main(String[] args) throws IOException {
    FileOutputStream fw = new FileOutputStream("datos.dat", false);
    DataOutputStream ds = new DataOutputStream(fw);
    int[] m = {5, 10, 3, 6};
    for (int i = 0; i < m.length; i++) {
      ds.writeInt(m[i]);
    }
    ds.close();
  }
}
