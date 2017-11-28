package Controler;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Pergunta extends Categoria {

    ArrayList<String> perguntas = new ArrayList<String>();

    public Pergunta(String categoria, Pessoa pessoa) {
        super(categoria, pessoa);
    }

    private void buscaPerguntas() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:/Workspace/ShowDoMilhao/perguntas/perguntas.txt"));
            String linha;
            while ((linha = br.readLine()) != null) {
                perguntas.add(linha);
            }

            br.close();
        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n",
            e.getMessage());
        }
    }

    public ArrayList<String> getPerguntas() {
        buscaPerguntas();
        return perguntas;
    }

}
