package br.com.letscode;

import java.util.Scanner;

public class App
{
    public static void main(String[] args) {

        System.out.println("Hello, world! Vamos cadastrar você. Vem cá...");

        System.out.print("Nome: ");
        String nome = new Scanner(System.in).nextLine();
        System.out.print("Idade: ");
        Integer idade = new Scanner(System.in).nextInt();
        System.out.println("Sexo: 1 - Feminino | 2 - Masculino");
        
        

    }

}
