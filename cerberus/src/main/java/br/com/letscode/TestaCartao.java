public class TestaCartao {

    public static void main(String[] args) {

        CartaoDeCredito card = new CartaoDeCredito();
            
        card.setNumCartao("1111222233334444");
        System.out.println("numero do cartao:  " + card.getNumCartao());

        card.setValidade(2022, 11, 31);
        System.out.println("validade:  " + card.getValidade());
       
    }
}
