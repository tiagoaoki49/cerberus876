package br.com.letscode.Models.enums;

public enum EstadoCivil {
  SOLTEIRO(1),
  CASADO(2),
  DIVORCIADO(3),
  VIUVO(4);

  int estado;

  private EstadoCivil(int estado) {
    this.estado = estado;
  }

  static public void printAll() {
    for (EstadoCivil estadoCivil : EstadoCivil.values()) {
      System.out.println(estadoCivil.ordinal() + 1 + " " + estadoCivil.toString());
    }
  }

  public int getEstado() {
    return estado;
  }
}
