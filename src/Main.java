import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {
        BoletoBuilder builder = new ItauBoletoBuilder();

        GeradorBoletos diretor = new GeradorBoletos(builder);

        Boleto meuBoleto = diretor.gerarBoleto();

        SimpleDateFormat formatadorData = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("=================================================");
        System.out.println("           SISTEMA DE GERAÇÃO DE BOLETOS         ");
        System.out.println("=================================================");
        System.out.println("BANCO: " + meuBoleto.getBanco());
        System.out.println("LOGOTIPO: " + meuBoleto.getLogotipo());
        System.out.println("-------------------------------------------------");
        System.out.println("LINHA DIGITÁVEL:");
        System.out.println(meuBoleto.getLinhaDigitavel());
        System.out.println("-------------------------------------------------");
        System.out.println("CEDENTE: " + meuBoleto.getCedente());
        System.out.println("SACADO:  " + meuBoleto.getSacado());
        System.out.println("VALOR:   R$ " + meuBoleto.getValor());
        System.out.println("VENCIMENTO: " + formatadorData.format(meuBoleto.getVencimento().getTime()));
        System.out.println("-------------------------------------------------");
        System.out.println("DADOS BANCÁRIOS:");
        System.out.println("AGÊNCIA: " + meuBoleto.getAgencia() +
                " | CONTA: " + meuBoleto.getConta() +
                " | CARTEIRA: " + meuBoleto.getCarteira());
        System.out.println("NOSSO NÚMERO: " + meuBoleto.getNossoNumero());
        System.out.println("-------------------------------------------------");
        System.out.println("CÓDIGO DE BARRAS:");
        System.out.println(meuBoleto.getCodigoDeBarras());
        System.out.println("=================================================");

        GeradorBoletoPDF geradorPDF = new GeradorBoletoPDF();
        geradorPDF.exportar(meuBoleto, "boleto1.pdf");

    }
}
