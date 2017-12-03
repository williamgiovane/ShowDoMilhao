package Controler;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Pergunta {

    ArrayList<String> perguntas = new ArrayList<String>();

    private void buscaPerguntas(String categoria) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:/Workspace/ShowDoMilhao/perguntas/" + categoria + "/perguntas.txt"));
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

    public ArrayList<String> getPerguntas(String categoria) {
        buscaPerguntas(categoria);
        return perguntas;
    }
    
}
