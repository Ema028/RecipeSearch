package src;

import java.util.ArrayList;

public class Receita {
    private String nome;
    private String modoPreparo;
    private int tempoPreparo;
    private String culinaria;
    private ArrayList<IngredienteReceita> ingredientes;

    public Receita(String nome, String modoPreparo, int tempoPreparo, String culinaria) {
        this.nome = nome;
        this.modoPreparo = modoPreparo;
        this.tempoPreparo = tempoPreparo;
        this.culinaria = culinaria;
        this.ingredientes = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getModoPreparo() {
        return modoPreparo;
    }

    public int getTempoPreparo() {
        return tempoPreparo;
    }

    public String getCulinaria() {
        return culinaria;
    }

    public ArrayList<IngredienteReceita> getIngredientes() {
        return ingredientes;
    }

    

}
