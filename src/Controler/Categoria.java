package Controler;

import java.util.ArrayList;

public class Categoria {

    private String categoria;
    private ArrayList<String> alternativas;
    private ArrayList<String> perguntas;
    private ArrayList<String> respostas;
    
    public Categoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }
    
    public ArrayList<String> getAlternativas(String categoria) {
        this.alternativas = new ArrayList<String>();
        Alternativas alternativas = new Alternativas();
        this.alternativas = alternativas.getAlternativas(categoria);
        return this.alternativas;
    }
    
    public ArrayList<String> getPerguntas(String categoria) {
        this.perguntas = new ArrayList<String>();
        Pergunta pergunta = new Pergunta();
        this.perguntas = pergunta.getPerguntas(categoria);
        return this.perguntas;
    }
    
    public ArrayList<String> getRespostas(String categoria) {
        this.respostas = new ArrayList<String>();
        Resposta resposta = new Resposta();
        this.respostas = resposta.getRespostas(categoria);
        return this.respostas;
    }
    
    public String getAlternativasQuestao(int nroQuestao) {
        return this.alternativas.get(nroQuestao);
    }
    
    public String getRespostaQuestao(int nroQuestao) {
        return this.respostas.get(nroQuestao);
    }
    
}
