package src;

import java.util.ArrayList;

public class Ingrediente{
	private String nome;
	private ArrayList<Caracteristica> caracteristicas;
	private ArrayList<Receita> receitas;

	public Ingrediente(String nome){
        	this.nome = nome;
        	this.caracteristicas = new ArrayList<>();
			this.receitas= new ArrayList<>();
	}
	
	public boolean temCaracteristica(Caracteristica caracteristica){
        	for(Caracteristica c: caracteristicas){
				if(c.equals(caracteristica)){
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

	public String getNome(){
    	return nome;
	}

	public ArrayList<Caracteristica> getCaracteristicas() {
    	return caracteristicas;
	}
	
	public boolean temReceita(Receita receita){
		for (Receita r : receitas){
        	if (r.equals(receita)){
            	return true;
        }
    }
	return false;
	}

	public void adicionarReceita(Receita receita) {
    	if (!temReceita(receita)){
        	receitas.add(receita);
    	}
	}

	public ArrayList<Receita> getReceitas(){
    	return receitas;
	}

}
