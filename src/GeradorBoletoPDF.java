import com.lowagie.text.*;
import com.lowagie.text.pdf.*;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;

public class GeradorBoletoPDF {

    public void exportar(Boleto boleto, String destino) {
        Document documento = new Document(PageSize.A4);
        try {
            PdfWriter.getInstance(documento, new FileOutputStream(destino));
            documento.open();

            SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            Font fonteTitulo = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 14);
            Font fonteLabel = FontFactory.getFont(FontFactory.HELVETICA, 8);
            Font fonteValor = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 10);

            PdfPTable header = new PdfPTable(new float[]{1, 1, 4});
            header.setWidthPercentage(100);

            header.addCell(new Phrase(boleto.getBanco().split(" - ")[0], fonteTitulo));
            header.addCell(new Phrase("|" + boleto.getBanco().split(" - ")[1] + "|", fonteTitulo));
            PdfPCell cellLinha = new PdfPCell(new Phrase(boleto.getLinhaDigitavel(), fonteValor));
            cellLinha.setHorizontalAlignment(Element.ALIGN_RIGHT);
            cellLinha.setBorder(Rectangle.NO_BORDER);
            header.addCell(cellLinha);
            documento.add(header);

            PdfPTable corpo = new PdfPTable(4);
            corpo.setWidthPercentage(100);
            corpo.setSpacingBefore(10);

            corpo.addCell(criarCelula("Beneficiário", boleto.getCedente(), 3, fonteLabel, fonteValor));
            corpo.addCell(criarCelula("Vencimento", df.format(boleto.getVencimento().getTime()), 1, fonteLabel, fonteValor));

            corpo.addCell(criarCelula("Agência/Código Beneficiário", boleto.getAgencia() + " / " + boleto.getConta(), 1, fonteLabel, fonteValor));
            corpo.addCell(criarCelula("Espécie", "R$", 1, fonteLabel, fonteValor));
            corpo.addCell(criarCelula("Nosso Número", String.valueOf(boleto.getNossoNumero()), 1, fonteLabel, fonteValor));
            corpo.addCell(criarCelula("Valor do Documento", "R$ " + boleto.getValor(), 1, fonteLabel, fonteValor));

            corpo.addCell(criarCelula("Pagador (Sacado)", boleto.getSacado(), 4, fonteLabel, fonteValor));

            documento.add(corpo);

            documento.add(new Paragraph("\n\nCÓDIGO DE BARRAS:", fonteLabel));
            documento.add(new Paragraph(boleto.getCodigoDeBarras(), FontFactory.getFont(FontFactory.COURIER, 12)));

            documento.close();
            System.out.println("Arquivo '" + destino + "' gerado com sucesso!");

        } catch (Exception e) {
            System.err.println("Erro ao criar PDF: " + e.getMessage());
        }
    }

    private PdfPCell criarCelula(String label, String valor, int colspan, Font fLabel, Font fValor) {
        PdfPCell cell = new PdfPCell();
        cell.setColspan(colspan);
        cell.addElement(new Phrase(label, fLabel));
        cell.addElement(new Phrase(valor, fValor));
        cell.setPadding(5);
        return cell;
    }
}