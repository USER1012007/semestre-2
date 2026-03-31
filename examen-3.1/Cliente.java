public class Cliente extends Empresa {
  String nombre;
  AccionCliente listaAcciones[];
  Orden listaOrdenes[];

  public Cliente(String nombre) {
    super(nombre, "", 0.0, 0.0, 0.0);
    this.nombre = nombre;
  }

  public String getNombre() { return nombre; }
  public void setNombre(String nombre) { this.nombre = nombre; }
  public AccionCliente[] getListaAcciones() { return listaAcciones; }
  public void setListaAcciones(AccionCliente[] listaAcciones) {
    this.listaAcciones = listaAcciones;
  }
  public Orden[] getListaOrdenes() { return listaOrdenes; }
  public void setListaOrdenes(Orden[] listaOrdenes) {
    this.listaOrdenes = listaOrdenes;
  }

  public void agregarOrden(Empresa empresa, String tipo, double cantidad,
                           double precioObjetivo) {

    Orden nuevaOrden = new Orden(empresa, tipo, cantidad, precioObjetivo);
    if (listaOrdenes == null) {
      listaOrdenes = new Orden[1];
      listaOrdenes[0] = nuevaOrden;
    } else {
      Orden[] nuevaLista = new Orden[listaOrdenes.length + 1];
      System.arraycopy(listaOrdenes, 0, nuevaLista, 0, listaOrdenes.length);
      nuevaLista[listaOrdenes.length] = nuevaOrden;
      listaOrdenes = nuevaLista;
    }
  }

  public void calcularValorTotal() {
    double valorTotal = 0;
    for (AccionCliente accion : listaAcciones) {
      valorTotal +=
          accion.getEmpresa().getPrecioActual() * accion.getCantidad();
    }
    System.out.println("El valor total de las acciones del cliente " + nombre +
                       " es: " + valorTotal);
  }

  public void calcularGananciaTotal() {
    double gananciaTotal = 0;
    for (AccionCliente accion : listaAcciones) {
      double valorActual = accion.getEmpresa().getPrecioActual();
      double ganancia =
          (valorActual - accion.getPrecioCompra()) * accion.getCantidad();
      gananciaTotal += ganancia;
    }
    System.out.println("La ganancia total del cliente " + nombre +
                       " es: " + gananciaTotal);
  }

  public void listarAcciones() {
    System.out.println("Acciones del cliente " + nombre + ":");

    for (AccionCliente accion : listaAcciones) {

      System.out.println("- " + accion.getNombre() +
                         ": Valor = " + accion.getPrecioActual());
      accion.calcularDiferencia();
    }
  }
}
