package br.com.letscode.Models;

import java.time.LocalDate;

public class CartaoDeCredito {
  private int numeroDoCartao;
  LocalDate dataDeValidade;

  public int getNumeroDoCartao() {
    return numeroDoCartao;
  }

  public void setNumeroDoCartao(int numeroDoCartao) {
    this.numeroDoCartao = numeroDoCartao;
  }

  public LocalDate getDataDeValidade() {
    return dataDeValidade;
  }

  public void setDataDeValidade(LocalDate dataDeValidade) {
    this.dataDeValidade = dataDeValidade;
  }

}
