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
        this.boletoBuilder.buildLogotipo("[Imagem do logo do Itaú]");
        this.boletoBuilder.buildCodigoDeBarras("836500000015 123456789012 345678901234 567890123456");
        this.boletoBuilder.buildDadosBancarios("1234", "567890", "109");
        this.boletoBuilder.buildLinhaDigitavel("34191.23456 78901.234567 89012.345678 1 97000000018745");

        return this.boletoBuilder.getBoleto();
    }
}
