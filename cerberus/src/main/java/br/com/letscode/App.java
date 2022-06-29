package br.com.letscode;

import java.util.Arrays;
import java.util.Random;

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
        //int[][] t = new int[5][6];
        // System.out.println("t.length=" + t.length);
        // System.out.println("t[0].length=" + t[0].length);
        /*for (int i = 0; i< t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                t[i][j] = new Random().nextInt() % 500;
            }
        }*/

        int[] t = new int[5];
        for (int i = 0; i< t.length; i++) {
            t[i] = new Random().nextInt() % 500;
        }
        Arrays.stream(t).forEach(s -> System.out.print(s + " "));
        System.out.println();
        for (int i = 0; i < t.length - 1 ; i++) {
            for (int j = i + 1; j < t.length; j++) {
                if (t[i] > t[j]) {
                    int aux = t[i];
                    t[i] = t[j];
                    t[j] = aux;
                }
            }
        }
        Arrays.stream(t).forEach(s -> System.out.print(s + " "));

    }

}
