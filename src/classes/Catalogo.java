package classes;

import java.util.ArrayList;

import interfaces.Descritivel;

public class Catalogo implements Descritivel{
    private ArrayList<Receita> receitas;

    public Catalogo() {
        this.receitas = new ArrayList<>();
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

	@Override 
	public void printInfo(){
		System.out.println("Menu de Recceitas: ");
    	for(Receita r: receitas){
			r.printInfo();
		}
	}
}

