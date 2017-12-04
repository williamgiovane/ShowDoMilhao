package Controler;

import java.util.ArrayList;
import java.util.Random;

public class Jogo {

    private Pessoa pessoa;
    private Categoria categoria;
    String[] alternativasQuestao;
    ArrayList<String> perguntas = new ArrayList<String>();
    ArrayList<String> alternativas = new ArrayList<String>();
    ArrayList<String> respostas = new ArrayList<String>();
    String respostasQuestao;
    private int nroQuestao;
    Random random = new Random();
    private ArrayList<Integer> questoesJaPerguntadas;

    public Jogo(Pessoa pessoa, String categoria) {
        this.pessoa = pessoa;
        this.categoria = new Categoria(categoria);
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void carregaCategoria() {
        this.perguntas = this.categoria.getPerguntas(categoria.getCategoria());
        this.alternativas = this.categoria.getAlternativas(categoria.getCategoria());
        this.respostas = this.categoria.getRespostas(categoria.getCategoria());
        this.questoesJaPerguntadas = new ArrayList<Integer>();
    }

    public String perguntaAleatoria() {
        this.nroQuestao = random.nextInt(perguntas.size());
        for (int i = 0; i < this.questoesJaPerguntadas.size(); i++) {
            if (this.nroQuestao == this.questoesJaPerguntadas.get(i)) {
                this.nroQuestao = random.nextInt(perguntas.size());
                i = 0;
            }
        }
        this.questoesJaPerguntadas.add(this.nroQuestao);
        carregaAlternativasResposta();
        return this.perguntas.get(nroQuestao);
    }

    public String alternativas(int letra) {
        return this.alternativasQuestao[letra];
    }

    private void carregaAlternativasResposta() {
        String alternativas = this.categoria.getAlternativasQuestao(nroQuestao);
        this.alternativasQuestao = alternativas.split(";");
        this.respostasQuestao = this.categoria.getRespostaQuestao(nroQuestao);
    }

    public boolean validarResposta(String resposta) {
        if (resposta.equals(this.respostasQuestao)) {
            return true;
        } else {
            return false;
        }
    }
}
