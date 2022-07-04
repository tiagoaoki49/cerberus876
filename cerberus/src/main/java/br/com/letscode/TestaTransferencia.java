import java.math.BigDecimal;

public class TestaTransferencia {
    public static void main(String[] args) {
        BigDecimal deposito = new BigDecimal("2000.40");
        BigDecimal saque = new BigDecimal("1000.30");
        BigDecimal sd;
    //    Transferencia tr = new Transferencia();
        Conta tr = new Conta();

        System.out.println(" ");
        System.out.printf("Valor do depósito: " + deposito + "  " + "valor do saque: " + saque);
        tr.depositar(5114, 12345, deposito);
        sd = tr.getSaldo();
        System.out.println(" ");
        System.out.println("saldo após depósito: " + sd);

        tr.sacar(5114, 12345, saque);
        sd = tr.getSaldo();
        System.out.println(" ");
        System.out.println("saldo após saque: " + sd);

        
    }
}
