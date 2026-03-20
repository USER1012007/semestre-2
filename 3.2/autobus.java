public class autobus extends vehiculo {
  public int asientos;

  public void setAsientos(int asientos) { this.asientos = asientos; }
  public int getAsientos() { return asientos; }
  protected String queMarcaEs() { return marca; }
}
