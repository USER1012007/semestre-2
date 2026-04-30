class edificioOficinas implements edificio {
  private int numOficinas;
  private double superficie;

  public edificioOficinas(double superficie, int numOficinas) {
    this.superficie = superficie;
    this.numOficinas = numOficinas;
  }

  @Override
  public double getSuperficieEdificio() {
    return superficie;
  }

  public int getNumOficinas() { return numOficinas; }

  @Override
  public String toString() {
    return "edificio de oficinas: oficinas: " + numOficinas +
        ", superficie: " + superficie + "m^2]";
  }
}
