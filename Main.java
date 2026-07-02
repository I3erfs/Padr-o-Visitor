public class Main {
    public static void main(String[] args) {
        Relatorio relA = new RelatorioA();
        Relatorio relB = new RelatorioB();
        
        VisitorExportacao exportadorPDF = new ExportadorPDF();
        VisitorExportacao exportadorXML = new ExportadorXML();
        
        // O cliente chama o "aceitar" passando o formato desejado
        relA.aceitar(exportadorPDF);
        relB.aceitar(exportadorPDF);
        
        relA.aceitar(exportadorXML);
    }
}
