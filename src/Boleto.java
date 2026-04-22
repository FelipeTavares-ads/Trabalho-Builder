import java.util.Calendar;

public interface Boleto {
    String getSacado();
    double getValor();
    Calendar getVencimento();
    String getCedente();
    int getNossoNumero();
    String getBanco();
    String getCodigoDeBarras();
    String getLinhaDigitavel();
    String getLogotipo();
    String getAgencia();
    String getConta();
    String getCarteira();
}
