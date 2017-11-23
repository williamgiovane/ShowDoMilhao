/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

/**
 *
 * @author guiri
 */
public abstract class Jogo {
    
    private String categoria;
    private Pessoa pessoa;

    public Jogo(String categoria, Pessoa pessoa) {
        this.categoria = categoria;
        this.pessoa = pessoa;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public String getCategoria() {
        return categoria;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }
    
    private void buscaPergunta() {
        
    }
    
}
