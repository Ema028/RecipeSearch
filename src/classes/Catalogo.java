package classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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

	public void ordenarPorTempoPreparo(){
		Collections.sort(receitas, Comparator.comparingInt(Receita::getTempoPreparo));
	}

	public void filtrarReceitas(Usuario usuario){
		for(Receita r: receitas){
			if(usuario.aceita(r)) r.printInfo();
		}
	}

	@Override 
	public void printInfo(){
		System.out.println("Menu de Receitas: ");
    	for(Receita r: receitas){
			r.printInfo();
		}
	}
}

