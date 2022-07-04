import java.util.Scanner;

public class Claculadora {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("informe operacao a efetuar: SOMAR, SUBTRAIR, MULTIPLICAR, DIVIDIR");
            String operacao = sc.nextLine();
            operacao = operacao.toUpperCase();
            System.out.println("informe números");
            String linha = sc.nextLine();
            String[] strArray = linha.trim().split(",");
            double[] dbArray = new double[strArray.length];

            for(int i=0; i< strArray.length; i++){
                    dbArray[i] = Double.parseDouble(strArray[i]);
            }

            System.out.println(" ");

            switch(operacao){
            case "SOMAR":
                somar(dbArray);
                break;
            case "SUBTRAIR":
                subtrair(dbArray);
                break;
            case "MULTIPLICAR":
                multiplicar(dbArray);
                break;
            case "DIVIDIR":
                dividir(dbArray);
                break;
            default: 
                System.out.println("Tipo de operação inválida");
                break;
            }
        } 
        catch (Exception e) {
            System.out.println("erro nos dados: " + e);
        }
        finally{
            sc.close();
        }
    }

    public static double somar(double[] arr){
        double num = 0;
        for(int k=0; k < arr.length; k++){
            num = (num + arr[k]);
        }
        System.out.println("A soma é: " + String.format("%.2f",num));
        return num;
    }

    public static double subtrair(double[] arr){
        double num = arr[0];
        for(int k=1; k < arr.length; k++){
            num = (num - arr[k]);
        }
        System.out.println("A subtraçao é: " + String.format("%.2f",num));
        return num;
    }

    public static double multiplicar(double[] arr){
        double num = arr[0];
        for(int k=1; k < arr.length; k++){
            num = (num * arr[k]);
        }
        System.out.println("A multiplicaçao é: " + String.format("%.2f",num));

        return num;
    }
    
    public static double dividir(double[] arr){
        double num = arr[0];
        for(int k=1; k < arr.length; k++){
            num = (num / arr[k]);
        }
        System.out.println("A divisão é: " + String.format("%.2f",num));

        return num;
    }
    
}
