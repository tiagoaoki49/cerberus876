package br.com.letscode;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Pessoa p = new Pessoa();
        p.setNome("João Pedro");
        p.setIdade(20);
        p.setGenero(Genero.M);
        p.setEndereco("Sobradinho-DF");
        p.setAltura(1.75);
        p.setPeso(65);
        p.setEstadoCivil(EstadoCivil.SOLTEIRO);
    }
}
