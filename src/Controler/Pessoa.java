package Controler;

public class Pessoa extends Pontuacao {
    
    private String nome;

    public Pessoa(String nome, int pontos) {
        super(pontos);
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
