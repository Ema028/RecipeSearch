package classes;

import java.util.ArrayList;
import java.util.Objects;
import enums.Caracteristica;
import enums.Culinaria;
import interfaces.Descritivel;

public class Receita implements Descritivel {
    private String nome;
    private String modoPreparo;
    private int tempoPreparo; //minutos
    private Culinaria culinaria;
    private ArrayList<IngredienteReceita> ingredientes;

    public Receita(String nome, String modoPreparo, int tempoPreparo, Culinaria culinaria) {
        if(nome != null) this.nome = nome;
        if(modoPreparo != null) this.modoPreparo = modoPreparo;
        if(tempoPreparo > 0) this.tempoPreparo = tempoPreparo;
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

    public void adicionarIngrediente(IngredienteReceita ingrediente){
        for(IngredienteReceita i: ingredientes){
			if(i.equals(ingrediente)){
				return;
			}
		}
        ingredientes.add(ingrediente);
        ingrediente.getIngrediente().adicionarReceita(this);
    }

    public void adicionarIngrediente(Ingrediente ingrediente, double quantidade, String unidade){
        IngredienteReceita i = new IngredienteReceita(ingrediente, quantidade, unidade);
        this.adicionarIngrediente(i);
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
    public void printInfo(){
        System.out.println("Receita: "+ nome);
        System.out.println("Tempo de preparo: "+ tempoPreparo);
        System.out.println("Lista de Ingredientes: ");
        for(IngredienteReceita i: ingredientes){
			i.printInfo();
		}
        System.out.println("Modo de preparo: "+ modoPreparo);
    }

}
