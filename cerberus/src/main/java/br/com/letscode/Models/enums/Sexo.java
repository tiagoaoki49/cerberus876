package br.com.letscode.Models.enums;

public enum Sexo {
  MASCULINO("Masculino"),
  FEMININO("Feminino");

  String sexo;

  private Sexo(String sexo) {
    this.sexo = sexo;
  }

  public String getSexo() {
    return sexo;
  }
}
