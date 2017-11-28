package Controler;

class Pessoa {
    
    private String nome;
    private Pontuacao pontos;

    public Pessoa(String nome, Pontuacao pontos) {
        this.nome = nome;
        this.pontos = pontos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pontuacao getPontos() {
        return pontos;
    }

    public void setPontos(Pontuacao pontos) {
        this.pontos = pontos;
    }
    
}
