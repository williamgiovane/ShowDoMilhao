package Controler;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Alternativas extends Categoria {
    
    ArrayList<String[]> alternativas = new ArrayList<String[]>();

    public Alternativas(String categoria, Pessoa pessoa) {
        super(categoria, pessoa);
    }

    private void buscaAlternativas() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:/Workspace/ShowDoMilhao/perguntas/alternativas.txt"));
            String linha;
            
            while ((linha = br.readLine()) != null) {
                alternativas.add(linha.split(";"));
            }

            br.close();
        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n",
            e.getMessage());
        }
    }

    public ArrayList<String[]> getAlternativas() {
        buscaAlternativas();
        return alternativas;
    }
}
