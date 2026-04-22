import java.util.Calendar;

public class BoletoPadrao implements Boleto {
    private String sacado;
    private double valor;
    private Calendar vencimento;
    private String cedente;
    private int nossoNumero;
    private String banco;
    private String conta;
    private String carteira;
    private String agencia;
    private String logotipo;
    private String linhaDigitavel;
    private String codigoDeBarras;


    public BoletoPadrao(String sacado, double valor, Calendar vencimento, String cedente, int nossoNumero, String banco, String conta, String carteira, String agencia, String logotipo, String linhaDigitavel, String codigoDeBarras) {
        this.sacado = sacado;
        this.valor = valor;
        this.vencimento = vencimento;
        this.cedente = cedente;
        this.nossoNumero = nossoNumero;
        this.banco = banco;
        this.carteira = carteira;
        this.agencia = agencia;
        this.logotipo = logotipo;
        this.linhaDigitavel = linhaDigitavel;
        this.codigoDeBarras = codigoDeBarras;
        this.conta = conta;
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

    public String getConta(){
        return conta;
    }

    public String getCarteira(){
        return carteira;
    }

    public String getAgencia(){
        return agencia;
    }

    public String getLogotipo(){
        return logotipo;
    }

    public String getLinhaDigitavel(){
        return linhaDigitavel;
    }

    public String getCodigoDeBarras(){
        return codigoDeBarras;
    }
}

