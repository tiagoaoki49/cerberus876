package br.com.letscode;

import java.util.Scanner;

import br.com.letscode.Models.Pessoa;
import br.com.letscode.Models.enums.EstadoCivil;
import br.com.letscode.Models.enums.Sexo;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();
        System.out.print("Altura: ");
        pessoa.setAltura(scanner.nextDouble());
        EstadoCivil.whileEstadoCivilNotNull(scanner, pessoa);
        System.out.println(pessoa.toString());
        scanner.close();
    }
}
