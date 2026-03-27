public class frescos extends productos {
  String fechaEnvaasado = "";
  String paisOrigen = "";

  public frescos() { super(); }

  public String getFechaEnvaasado() { return fechaEnvaasado; }
  public void setFechaEnvaasado(String fechaEnvaasado) {
    this.fechaEnvaasado = fechaEnvaasado;
  }
  public String getPaisOrigen() { return paisOrigen; }
  public void setPaisOrigen(String paisOrigen) { this.paisOrigen = paisOrigen; }
}
