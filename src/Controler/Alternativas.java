package Controler;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Alternativas {
    
    ArrayList<String> alternativas = new ArrayList<String>();

    private void buscaAlternativas(String categoria) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:/Workspace/ShowDoMilhao/perguntas/" + categoria + "/alternativas.txt"));
            String linha;
            
            while ((linha = br.readLine()) != null) {
                alternativas.add(linha);
            }

            br.close();
        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n",
            e.getMessage());
        }
    }

    public ArrayList<String> getAlternativas(String categoria) {
        buscaAlternativas(categoria);
        return alternativas;
    }
}
