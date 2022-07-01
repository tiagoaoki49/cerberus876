package br.com.letscode;

import java.util.Scanner;

import br.com.letscode.Models.Pessoa;
import br.com.letscode.Models.enums.EstadoCivil;
import br.com.letscode.Models.enums.Sexo;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();
        System.out.println("Altura: ");
        pessoa.setAltura(scanner.nextDouble());
        System.out.println();
        pessoa.setEndereco("Brasil");
        EstadoCivil.printAll();
        pessoa.setEstadoCivil(EstadoCivil.CASADO);
        pessoa.setIdade(100);
        pessoa.setNome("Pessoa bem velha");
        pessoa.setPeso(100);
        pessoa.setSexo(Sexo.MASCULINO);
        scanner.close();
    }
}
