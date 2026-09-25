package classes;

import java.util.ArrayList;

public class Catalogo {
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

	public ArrayList<Receita> getReceitas(){
    	return receitas;
	}
}

