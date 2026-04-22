import java.util.Calendar;

public interface Boleto {
    String getSacado();
    double getValor();
    Calendar getVencimento();
    String getCedente();
    int getNossoNumero();
    String getBanco();
}
