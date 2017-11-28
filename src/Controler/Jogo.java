package Controler;

public class Jogo {
    
    private Pessoa pessoa;

    public Jogo(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }    
}
