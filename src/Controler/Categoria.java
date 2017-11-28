package Controler;

public class Categoria {

    private String categoria;
    Pergunta perguntas = new Pergunta(categoria);

    public int getQtdPerguntas() {
        return perguntas.perguntas.size();
    }
    
    public Categoria(String categoria) {
        this.categoria = categoria;
    }
    
    public String getPerguntaAleatoria(int item) {
        return perguntas.getPerguntaAle(item);
    }

    public void carregaPerguntasPorCategoria() {
        perguntas.getPerguntas(categoria);
    }
    
}
