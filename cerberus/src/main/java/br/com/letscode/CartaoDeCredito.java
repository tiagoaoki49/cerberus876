import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CartaoDeCredito {

    private String numCartao; 
    private Calendar validade = Calendar.getInstance();
    
    String formato = "yyy-MM-d";     
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(formato);

    public String getNumCartao() {
        return numCartao;
    }
    public void setNumCartao(String numCartao) {
        this.numCartao = numCartao;
    }
    public String getValidade() {
        return simpleDateFormat.format(validade.getTime());
    }
    public void setValidade(int yyyy, int mm, int dd) {
        this.validade.set(Calendar.YEAR,yyyy);
        this.validade.set(Calendar.MONTH,mm);
        this.validade.set(Calendar.DAY_OF_MONTH,dd);

    }
}
