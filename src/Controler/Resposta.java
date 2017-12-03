package Controler;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Resposta {
    
    ArrayList<String> respostas = new ArrayList<String>();

    private void buscaRespostas(String categoria) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:/Workspace/ShowDoMilhao/perguntas/" + categoria + "/respostas.txt"));
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

    public ArrayList<String> getRespostas(String categoria) {
        buscaRespostas(categoria);
        return respostas;
    }

}
