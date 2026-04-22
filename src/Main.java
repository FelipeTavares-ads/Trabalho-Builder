public class Main {
    public static void main(String[] args) {
        BoletoBuilder boleto1 = new ItauBoletoBuilder();
        GeradorBoletos diretor = new GeradorBoletos(boleto1);
        Boleto meuBoleto = diretor.gerarBoleto();

        System.out.println("_________________BOlETO GERADO___________________");
        System.out.println(meuBoleto);
        System.out.println(meuBoleto.getValor());
        System.out.println(meuBoleto.getSacado());
        System.out.println(meuBoleto.getCedente());
        System.out.println(meuBoleto.getVencimento());
        System.out.println(meuBoleto.getNossoNumero());
    }
}
