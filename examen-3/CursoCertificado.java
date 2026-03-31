public class CursoCertificado extends Curso {
  String institucion;
  boolean incluyeCertificado;

  public CursoCertificado() { super(); }

  @Override
  public void mostrarInformacion() {
    super.mostrarInformacion();
    System.out.println("institucion: " + institucion);
  }

  @Override
  public double calcularCosto() {
    double costoBase = super.calcularCosto();
    if (incluyeCertificado) {
      costoBase *= 1.20;
    }
    return costoBase;
  }

  public void emitirCertificado() {
    if (incluyeCertificado) {
      System.out.println("Certificado emitido por " + institucion);
    } else {
      System.out.println("Este curso no incluye certificado.");
    }
  }
}
