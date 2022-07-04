import java.math.BigDecimal;
public class TestaConta {

    public static void main(String[] args) {
        BigDecimal deposito = new BigDecimal("2000.40");
        BigDecimal saque = new BigDecimal("1000.30");
        BigDecimal sd;
        Conta ct = new Conta();

        //set e get pega agencia
        ct.setAgencia(5114);
        System.out.println("A agência é: " + ct.getAgencia());

        //set e get conta
        ct.setConta(12345);
        System.out.println("A conta é: " + ct.getConta());

        //set e get titular
        ct.setTitular("Bill Gates");
        System.out.println("O titular é: " + ct.getTitular());

        //set e get limite
        BigDecimal limite = new BigDecimal(20000);
        ct.setLimite(limite);
        System.out.println("O limite da conta é: " + ct.getLimite());

        // Testa deposito
        System.out.println(" ");
        System.out.printf("Valor do depósito: " + deposito + "  " + "valor do saque: " + saque);
        ct.depositar(5114, 12345, deposito);
        sd = ct.getSaldo();
        System.out.println(" ");
        System.out.println("saldo após depósito: " + sd);

        // Testa saque
        ct.sacar(5114, 12345, saque);
        sd = ct.getSaldo();
        System.out.println(" ");
        System.out.println("saldo após saque: " + sd);

    }
}

