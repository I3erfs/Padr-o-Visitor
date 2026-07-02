// Implementação para PDF
public class ExportadorPDF implements VisitorExportacao {
    public void visitarRelatorioA(RelatorioA relatorio) {
        System.out.println("Exportando " + relatorio.getDados() + " para PDF.");
    }

    public void visitarRelatorioB(RelatorioB relatorio) {
        System.out.println("Exportando " + relatorio.getOutrosDados() + " para PDF.");
    }
}

// Implementação para XML
 class ExportadorXML implements VisitorExportacao {
    public void visitarRelatorioA(RelatorioA relatorio) {
        System.out.println("Exportando " + relatorio.getDados() + " para XML.");
    }

    public void visitarRelatorioB(RelatorioB relatorio) {
        System.out.println("Exportando " + relatorio.getOutrosDados() + " para XML.");
    }
}
