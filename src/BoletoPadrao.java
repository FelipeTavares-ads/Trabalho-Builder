import java.util.Calendar;

public class BoletoPadrao implements Boleto {
    private String sacado;
    private double valor;
    private Calendar vencimento;
    private String cedente;
    private int nossoNumero;
    private String banco;

    public BoletoPadrao(String sacado, double valor, Calendar vencimento, String cedente, int nossoNumero, String banco) {
        this.sacado = sacado;
        this.valor = valor;
        this.vencimento = vencimento;
        this.cedente = cedente;
        this.nossoNumero = nossoNumero;
        this.banco = banco;
    }

    public String getSacado(){
        return sacado;
    }

    public double getValor(){
        return valor;
    }

    public Calendar getVencimento(){
        return vencimento;
    }

    public String getCedente(){
        return cedente;
    }

    public int getNossoNumero(){
        return nossoNumero;
    }

    public String getBanco(){
        return banco;
    }
}

