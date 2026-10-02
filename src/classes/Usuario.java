package classes;

import java.util.ArrayList;

import interfaces.Validavel;

public class Usuario implements Validavel {
    private String nome;
    private ArrayList<Restricao> restricoes;

    public Usuario(String nome){
        this.nome = nome;
        this.restricoes = new ArrayList<>();
    }

    public boolean temRestricao(Restricao restricao){
        for(Restricao c: restricoes){
			if(c.equals(restricao)){
				return true;
			}
		}
		return false;
    }

	public void adicionarRestricao(Restricao restricao){
        if (!temRestricao(restricao)){
            restricoes.add(restricao);
        }
    }

    @Override 
    public boolean validar(){
        if(nome==null){
            return false;
        }
        return true;
    }
}
