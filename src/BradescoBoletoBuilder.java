import java.util.Calendar;

public class BradescoBoletoBuilder implements BoletoBuilder {
    private String sacado;
    private double valor;
    private Calendar vencimento;
    private String cedente;
    private int nossoNumero;
    private String banco;
    private String conta;
    private String carteira;
    private String linhaDigitavel;
    private String agencia;
    private String logotipo;
    private String codigoDeBarras;

    public void buildSacado(String sacado) {
        this.sacado = sacado;
    }

    public void buildValor(double valor) {

        if (valor <=0){
            throw new IllegalArgumentException("Seu valor não pode ser negativo ou zero");
        }

        this.valor = valor;
    }

    public void buildVencimento(Calendar vencimento) {
        this.vencimento = vencimento;
    }

    public void buildCedente(String cedente) {
        this.cedente = cedente;
    }

    public void buildNossoNumero(int nossoNumero) {
        String numeroParaTexto = String.valueOf(nossoNumero);

        if (numeroParaTexto.length() > 11){
            throw new IllegalArgumentException("Erro do FEBRABAN: Nosso Número do Banco Bradesco não pode ter mais de 11 dígitos");
        }

        this.nossoNumero = nossoNumero;
    }

    public void buildBanco(String banco){
        this.banco = banco;
    }

    public void buildDadosBancarios(String agencia, String conta, String carteira){
        this.agencia = agencia;
        this.conta = conta;
        this.carteira = carteira;
    }


    public void buildLinhaDigitavel(String linhaDigitavel){
        this.linhaDigitavel = linhaDigitavel;
    }


    public void buildLogotipo(String logotipo){
        this.logotipo = logotipo;
    }

    public void buildCodigoDeBarras(String codigoDeBarras){
        this.codigoDeBarras = codigoDeBarras;
    }

    public Boleto getBoleto(){
        return new BoletoPadrao(sacado, valor, vencimento, cedente, nossoNumero, "237 - Bradesco", conta, carteira, agencia, logotipo, linhaDigitavel,codigoDeBarras);
    }
}
