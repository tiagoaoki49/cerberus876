package br.com.letscode;

import br.com.letscode.veiculos.Veiculo;

public class App
{
    public static void main(String[] args) {

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
