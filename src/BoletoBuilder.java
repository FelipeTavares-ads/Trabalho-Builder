import java.util.Calendar;

public interface BoletoBuilder {
    void buildSacado(String sacado);
    void buildValor(double valor);
    void buildVencimento(Calendar vencimento);
    void buildCedente(String cedente);
    void buildNossoNumero(int nossoNumero);
    void buildBanco(String banco);

    Boleto getBoleto();
}
