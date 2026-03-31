public class Sector {
  String nombre;
  Empresa listaEmpresas[] = null;

  public Sector(String nombre) { this.nombre = nombre; }

  public String getNombre() { return nombre; }
  public void setNombre(String nombre) { this.nombre = nombre; }
  public Empresa[] getListaEmpresas() { return listaEmpresas; }
  public void setListaEmpresas(Empresa[] listaEmpresas) {
    this.listaEmpresas = listaEmpresas;
  }

  public void agregarEmpresa(Empresa empresa) {
    if (listaEmpresas == null) {
      listaEmpresas = new Empresa[1];
      listaEmpresas[0] = empresa;
    } else {
      Empresa[] nuevaLista = new Empresa[listaEmpresas.length + 1];
      System.arraycopy(listaEmpresas, 0, nuevaLista, 0, listaEmpresas.length);
      listaEmpresas = nuevaLista;
    }
  }

  public double calcularIndice() {
    double suma = 0;
    for (Empresa empresa : listaEmpresas) {
      suma += empresa.getPrecioActual();
    }
    return suma / listaEmpresas.length;
  }

  public double calcularValorMinimo() {
    double valorMinimo = Double.MAX_VALUE;
    for (Empresa empresa : listaEmpresas) {
      if (empresa.getPrecioMin() < valorMinimo) {
        valorMinimo = empresa.getPrecioMin();
      }
    }
    return valorMinimo;
  }

  public double calcularValorMaximo() {
    double valorMaximo = Double.MIN_VALUE;
    for (Empresa empresa : listaEmpresas) {
      if (empresa.getPrecioMax() > valorMaximo) {
        valorMaximo = empresa.getPrecioMax();
      }
    }
    return valorMaximo;
  }

  public void calcularDiferencia() {
    double valorMinimo = calcularValorMinimo();
    double valorMaximo = calcularValorMaximo();
    double diferencia = valorMaximo - valorMinimo;
    System.out.println(
        "La diferencia entre el valor máximo y mínimo del sector " + nombre +
        " es: " + diferencia);
  }
}
