package br.com.letscode;

import java.math.BigDecimal;

public class App
{
    public static void main( String[] args )
    {
        final Pessoa pessoa = new Pessoa();
        pessoa.setNome("Nuno Passos");
        pessoa.setIdade(36);
        pessoa.setSexo(Pessoa.Sexo.MASCULINO);
        pessoa.setEndereco("Rua de baixo nº5, 3º Esq");
        pessoa.setEstadoCivil(Pessoa.EstadoCivil.CASADO);
        pessoa.setAltura(BigDecimal.valueOf(1.82));
        pessoa.setPeso(BigDecimal.valueOf(75.4));

        System.out.println(pessoa);
    }
}
