package classes;

import java.util.ArrayList;
import java.util.Objects;
import enums.Caracteristica;
import enums.Culinaria;
import interfaces.Validavel;

public class Receita implements Validavel {
    private String nome;
    private String modoPreparo;
    private int tempoPreparo;
    private Culinaria culinaria;
    private ArrayList<IngredienteReceita> ingredientes;

    public Receita(String nome, String modoPreparo, int tempoPreparo, Culinaria culinaria) {
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

    public Culinaria getCulinaria() {
        return culinaria;
    }

    public void printInfo(){
        System.out.println("Receita: "+ nome);
        System.out.println("Lista de Ingredientes: ");
        for(IngredienteReceita i: ingredientes){
			i.printInfo();
		}
        System.out.println("Modo de preparo: "+ modoPreparo);
    }

    public void adicionarIngrediente(IngredienteReceita ingrediente){
        for(IngredienteReceita i: ingredientes){
			if(i.equals(ingrediente)){
				return;
			}
		}
        ingredientes.add(ingrediente);
    }

    public boolean temCaracteristica(Caracteristica caracteristica){
        for(IngredienteReceita i: ingredientes){
			if(i.getIngrediente().temCaracteristica(caracteristica)){
				return true;
			}
		}
		return false;
    }

    @Override
    public boolean equals(Object o){
        if (this == o){
            return true;
        }
        if (o == null || getClass() != o.getClass()){
            return false;
        }
        Receita receita = (Receita) o;
        return Objects.equals(nome, receita.nome);
    }    

    @Override
    public boolean validar() {
        if(nome==null){
            return false;
        }
        if(modoPreparo==null){
            return false;
        }
        if(tempoPreparo<=0){
            return false;
        }
        if(culinaria==null){
            return false;
        }
        return true;
    }
}
