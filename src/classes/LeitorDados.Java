package classes;

import java.io.File;
import java.util.Scanner;

public class LeitorDados {
    public void carregarIngredientes() throws Exception {
        Scanner leitor = new Scanner(new File("dados/ingredientes.txt"));

        while (leitor.hasNextLine()){
            String[] linha = leitor.nextLine().split("|");

            Ingrediente ingrediente = new Ingrediente(linha[0]);

            String[] caracteristicas = linha[1].split(",");

            for (String caracteristica : caracteristicas) {
                ingrediente.adicionarCaracteristica(Caracteristica.valueOf(caracteristica));
            }
        }
        leitor.close();
    }
}