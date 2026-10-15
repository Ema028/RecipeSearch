package classes;

import java.util.ArrayList;

import enums.Caracteristica;
import interfaces.Validavel;

public class Ingrediente implements Validavel{
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
	
	public boolean validar(){
		if(nome== null){
			return false;
		}
		return true;
	}
	
}
