package br.com.letscode;

import java.util.Arrays;
import java.util.Random;

import br.com.letscode.veiculos.Veiculo;

public class App
{
    public static void main(String[] args) {
        String str = "Isto é uma String";
        char[] charArray = str.toCharArray();

        // foreach
        // Não permite a alteração do array
/*
        for (char c: charArray) {
            if (c == ' ') {
                c = '_';
            }
            System.out.print(c);
        }
 */
        String[] strArray = {"str1", "str2", "str3"};

        // Arrays.stream(strArray).forEach(System.out::println);
        // Arrays.stream(strArray).forEach(s -> System.out.println(s));

        // pode não percorrer todos os elementos
        // permite alterar o array
        for (int i = 0; i < charArray.length; i+=2) {
            if (charArray[i] == ' ') {
                charArray[i] = '_';
            }
            // System.out.print(c);
        }

        // criação de uma matriz
        int[][] matrix = Utils.populateMatrix(5, 6);
        Utils.printMatrix(matrix);
        Utils.orderMatrix(matrix);
        System.out.println();
        Utils.printMatrix(matrix);


        int[] array = Utils.populateArray(5);
        Arrays.stream(array).forEach(s -> System.out.print(s + " "));
        System.out.println();
        Utils.orderArray(array);
        Arrays.stream(array).forEach(s -> System.out.print(s + " "));

        Veiculo v = new Veiculo();
        v.setCor("Vermelho");
        v.setPotencia(1500);
        v.setAno(1994);
        v.setTipo(Veiculo.TipoVeiculo.MOTA);
        v.setMarca(Veiculo.Marca.BMW);
        v.setModelo("Z500");
        v.setNumeroRodas(2);
        v.setPlaca("AA-00-AA");


    }

}
