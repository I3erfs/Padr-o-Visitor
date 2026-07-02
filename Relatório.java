// Interface dos Elementos
public interface Relatorio {
    void aceitar(VisitorExportacao visitor);
}

// Relatório Concreto A
     class RelatorioA implements Relatorio {
    public void aceitar(VisitorExportacao visitor) {
        visitor.visitarRelatorioA(this);
    }
    
    public String getDados() { return "Dados do Relatório A"; }
}

// Relatório Concreto B
    class RelatorioB implements Relatorio {
    public void aceitar(VisitorExportacao visitor) {
        visitor.visitarRelatorioB(this);
    }
    
    public String getOutrosDados() { return "Dados do Relatório B"; }
}
