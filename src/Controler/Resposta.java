package Controler;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Resposta extends Categoria {
    
    ArrayList<String> respostas = new ArrayList<String>();

    public Resposta(String categoria) {
        super(categoria);
    }
    
    private void buscaRespostas() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:/Workspace/ShowDoMilhao/perguntas/respostas.txt"));
            String linha;
            while ((linha = br.readLine()) != null) {
                respostas.add(linha);
            }

            br.close();
        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n",
            e.getMessage());
        }
    }

    public ArrayList<String> getRespostas() {
        buscaRespostas();
        return respostas;
    }

}
