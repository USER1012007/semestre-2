public class Validacion {
  static void rango(int num, int den) throws Exceptionintervalo {
    if ((num > 100) || (den < 5)) {
      throw new Exceptionintervalo("Numeros fuera de intervalo");
    }
  }
}
