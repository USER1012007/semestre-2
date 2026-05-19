public class ExepcionApp3 {
  public static void main(String[] args) throws Exceptionintervalo {
    String str1 = "5";
    String str2 = "3";
    String respuesta;
    int numerador, denominador, cociente;
    try {
      numerador = Integer.parseInt(str1);
      denominador = Integer.parseInt(str2);
      Validacion.rango(numerador, denominador);
      cociente = numerador / denominador;
      respuesta = String.valueOf(cociente);
    } catch (NumberFormatException ex) {
      respuesta = "Error: No se pudo convertir a numero";
    } catch (ArithmeticException ex) {
      respuesta = ex.getMessage();
    }
    System.out.println(respuesta);
  }
}
