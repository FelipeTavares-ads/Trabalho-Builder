import java.util.Calendar;

public class GeradorBoletos {
    private BoletoBuilder boletoBuilder;

    public GeradorBoletos(BoletoBuilder boletoBuilder){
        this.boletoBuilder = boletoBuilder;
    }

    public Boleto gerarBoleto(){
        this.boletoBuilder.buildSacado("Felipe");
        this.boletoBuilder.buildValor(160);

        Calendar dataVencimento = Calendar.getInstance();

        dataVencimento.add(Calendar.DATE, 30);

        this.boletoBuilder.buildVencimento(dataVencimento);
        this.boletoBuilder.buildCedente("Hugo");
        this.boletoBuilder.buildNossoNumero(12345678);

        return this.boletoBuilder.getBoleto();
    }
}
