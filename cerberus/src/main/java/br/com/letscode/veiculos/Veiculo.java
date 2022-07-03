package br.com.letscode.veiculos;

import java.util.Objects;

public class Veiculo {
    private String cor;
    private int potencia;
    private int ano;
    private TipoVeiculo tipo;
    private Marca marca;
    private String modelo;
    private int numeroRodas;
    private String placa;

    public int getNumeroRodas() {
        return this.numeroRodas;
    }

    public void setNumeroRodas(int numeroRodas) {
        if (numeroRodas < 1 ) {
            System.out.println("Numero inválido");
            return;
        }
        if (this.tipo != null) {
            if (this.tipo.getMinRodas() > numeroRodas || this.tipo.getMaxRodas() < numeroRodas) {
                System.out.println("Número de rodas inválido para o tipo de veiculo:");
                System.out.println(this.tipo + ": entre " + this.tipo.minRodas + " e " + this.tipo.maxRodas + " rodas!");
                return;
            }
        }
        this.numeroRodas = numeroRodas;
    }

    public String getCor() {
        return cor;
    }

    public int getPotencia() {
        return potencia;
    }

    public int getAno() {
        return ano;
    }

    public TipoVeiculo getTipo() {
        return tipo;
    }

    public Marca getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setTipo(TipoVeiculo tipo) {
        if (this.numeroRodas > 0) {
            if (tipo.minRodas > this.numeroRodas || tipo.maxRodas < this.numeroRodas) {
                System.out.println("O tipo de veiculo não é válido para o número de rodas definidas");
                System.out.println(this.numeroRodas + " rodas definidas, o tipo " + tipo + " permite entre " + tipo.getMinRodas() + " e " + tipo.getMaxRodas() + " rodas!");
                return;
            }
        }
        this.tipo = tipo;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Veiculo veiculo = (Veiculo) o;
        return potencia == veiculo.potencia &&
            ano == veiculo.ano &&
            numeroRodas == veiculo.numeroRodas &&
            Objects.equals(cor, veiculo.cor) &&
            Objects.equals(tipo, veiculo.tipo) &&
            Objects.equals(modelo, veiculo.modelo) &&
            Objects.equals(placa, veiculo.placa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cor, potencia, ano, tipo, modelo, numeroRodas, placa);
    }

    public enum Marca {
        BMW,
        MERCEDES,
        FORD,
        RENAULT,
        TESLA,
        VW;
    }

    public enum TipoVeiculo {
        MOTA (2, 3),
        AUTOMOVEL(4, 4),
        ONIBUS(4, 6);

        private int minRodas;
        private int maxRodas;

        TipoVeiculo(int minRodas, int maxRodas) {
            this.minRodas = minRodas;
            this.maxRodas = maxRodas;
        }

        public int getMinRodas() {
            return minRodas;
        }

        public void setMinRodas(int minRodas) {
            this.minRodas = minRodas;
        }

        public int getMaxRodas() {
            return maxRodas;
        }

        public void setMaxRodas(int maxRodas) {
            this.maxRodas = maxRodas;
        }
    }
}

