package classes;

import java.util.ArrayList;

import enums.Caracteristica;
import interfaces.Descritivel;

public class Ingrediente implements Descritivel{
	private String nome;
	private ArrayList<Caracteristica> caracteristicas;
	private ArrayList<Receita> receitas;

	public Ingrediente(String nome){
		if(nome != null) this.nome = nome;
        this.caracteristicas = new ArrayList<>();
		this.receitas = new ArrayList<>();
	}
	
	public boolean temCaracteristica(Caracteristica caracteristica){
        for(Caracteristica c: caracteristicas){
			if(c == caracteristica){
				return true;
			}
		}
		return false;
    }

	public void adicionarCaracteristica(Caracteristica caracteristica){
        if (!temCaracteristica(caracteristica)){
            caracteristicas.add(caracteristica);
        }
    }

	public void adicionarReceita(Receita receita){
        receitas.add(receita);
    }

	public String getNome(){
    	return nome;
	}

	public ArrayList<Caracteristica> getCaracteristicas() {
    	return new ArrayList<>(caracteristicas);
	}
	
	@Override
	public void printInfo(){
		System.out.println("Ingrediente: "+ nome);
		System.out.println("Caracteristicas: ");
		for(Caracteristica c: caracteristicas){
			System.out.print(c);
			System.out.print(" | ");
		}
		System.out.println("");
		System.out.println("Receitas: ");
		for(Receita r: receitas){
			r.printNome();
			System.out.print(" | ");
		}
		System.out.println("");
	}

	@Override
	public void printNome() {
		System.out.print(nome);
	}
	
}
