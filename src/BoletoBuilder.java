import java.util.Calendar;

public interface BoletoBuilder {
    void buildSacado(String sacado);
    void buildValor(double valor);
    void buildVencimento(Calendar vencimento);
    void buildCedente(String cedente);
    void buildNossoNumero(int nossoNumero);
    void buildDadosBancarios(String agencia, String conta, String carteira);
    void buildCodigoDeBarras(String codigoDeBarras);
    void buildLinhaDigitavel(String linhaDigitavel);
    void buildLogotipo(String logotipo);
    void buildBanco(String banco);
    Boleto getBoleto();
}
