public class AEmpleado {

  public int HORAS_NORMALES = 70;
  public int HORAS_EXTRAS = 85;

  public int horasTotales = 0;
  public int horasExtras = 0;

  public AEmpleado(int horasTotales) {
    this.horasTotales = horasTotales;
    if (horasTotales > 40) {
      this.horasExtras = horasTotales - 40;
    }
  }

  public double SalarioBruto(int horas) {
    double bruto = 0;
    if (horas > 40) {
      return bruto =
                 (HORAS_NORMALES * horas) + (HORAS_EXTRAS * this.horasExtras);
    } else {
      return bruto = HORAS_NORMALES * horas;
    }
  }

  public double IMSS(double salarioBruto) { return salarioBruto * .05; }

  public double calcularISTP(double salarioBruto) {
    if (salarioBruto > 5000) {
      return salarioBruto * .05;
    } else if (salarioBruto > 2001) {
      return salarioBruto * .03;
    } else {
      return salarioBruto;
    }
  }

  public double SalarioNeto(double bruto) {
    double istp = calcularISTP(bruto);
    double imss = IMSS(bruto);
    return (bruto - istp - imss);
  }
}
