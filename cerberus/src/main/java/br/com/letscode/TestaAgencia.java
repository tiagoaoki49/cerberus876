public class TestaAgencia {
    public static void main(String[] args) {

        Agencia age = new Agencia();

        System.out.println("O número da agência a gravar é: 5114");
        age.setAgencia("5114");
        System.out.println("O número da agência é: " + age.getAgencia());

        System.out.println("O nome da agência a gravar é: Estilo 316 Norte");
        age.setNomeAgencia("Estilo 316 Norte");
        System.out.println("O número da agência é: " + age.getNomeAgencia());
    }
}
