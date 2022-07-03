package br.com.letscode;

import java.math.BigDecimal;

public class Pessoa {
    private String nome;
    private int idade;
    private Sexo sexo;
    private String endereco;
    private EstadoCivil estadoCivil;
    private BigDecimal altura;
    private BigDecimal peso;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public BigDecimal getAltura() {
        return altura;
    }

    public void setAltura(BigDecimal altura) {
        this.altura = altura;
    }

    public BigDecimal getPeso() {
        return peso;
    }

    public void setPeso(BigDecimal peso) {
        this.peso = peso;
    }

    public enum Sexo {
        MASCULINO("Masculino"),
        FEMININO("Feminino"),
        NAO_DEFINIDO("Não definido");

        private String descricao;

        Sexo(String _descricao) {
            this.descricao = _descricao;
        }

        public String getDescricao() {
            return descricao;
        }
    }

    public enum EstadoCivil {
        SOLTEIRO("Solteiro(a)"),
        CASADO("Casado(a)"),
        VIUVO("Viuvo(a)"),
        DIVORCIADO("Divorciado(a)");

        private String descricao;

        EstadoCivil(String _descricao) {
            this.descricao = _descricao;
        }

        public String getDescricao() {
            return this.descricao;
        }
    }
}
