import java.util.Calendar;

public class ItauBoletoBuilder implements BoletoBuilder {
    private String sacado;
    private double valor;
    private Calendar vencimento;
    private String cedente;
    private int nossoNumero;
    private String banco;

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
        String numeroEmTexto = String.valueOf(nossoNumero);

        if (numeroEmTexto.length() > 8) {
            throw new IllegalArgumentException("Erro FEBRABAN: Nosso Número do Itaú não pode ter mais de 8 dígitos!");
        }

        this.nossoNumero = nossoNumero;
    }

    public void buildBanco(String banco){
        this.banco = banco;
    }

    public Boleto getBoleto(){
        return new BoletoPadrao(sacado, valor, vencimento, cedente, nossoNumero, "341 - Itaú");
    }
}
