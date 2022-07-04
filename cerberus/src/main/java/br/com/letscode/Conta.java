import java.math.BigDecimal;

public class Conta {
   
    private BigDecimal saldo = new BigDecimal(0);
    private int conta = 0;
    private int agencia = 0;
    private String titular;
    private BigDecimal limite = new BigDecimal(0);

    public void sacar(int age, int conta, BigDecimal valor){
        this.agencia = age;
        this.conta = conta;
        if (saldo.compareTo(valor) == 1 || saldo.compareTo(valor) == 0) {
            saldo = saldo.subtract(valor);
        } else {
            System.out.println("saldo insuficiente");
        }
    }

    public void depositar(int age, int conta, BigDecimal valor){
        this.agencia = age;
        this.conta = conta;
        saldo = saldo.add(valor);
    }
    
    public BigDecimal getSaldo() {
        return saldo;
    }
    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }
    public int getConta() {
        return conta;
    }
    public void setConta(int conta) {
        this.conta = conta;
    }
    public int getAgencia() {
        return agencia;
    }
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
    public BigDecimal getLimite() {
        return limite;
    }

    public void setLimite(BigDecimal limite) {
        this.limite = limite;
    }
}

