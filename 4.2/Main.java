public class Main {
  public static void main(String[] args) {
    parque[] zonas_protegidas = new parque[5];

    zonas_protegidas[0] = new caza(100, 5, "Animal1", 100, "arma1");
    zonas_protegidas[1] = new caza(200, 10, "Animal2", 200, "arma2");

    zonas_protegidas[2] = new protegido(10, 5, "zona protegida 1", 50.0);
    zonas_protegidas[3] = new protegido(15, 10, "zona protegida 2", 60.0);
    zonas_protegidas[4] = new protegido(20, 15, "zona protegida 3", 70.0);

    int count = 0;
    for (parque par : zonas_protegidas) {
      count++;
      System.out.println("zona protegida " + count + ": ");
      System.out.println("nombre: " + par.getNombre());
      System.out.println(par);
    }
  }
}
