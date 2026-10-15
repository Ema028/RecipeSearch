package classes;

import java.util.ArrayList;

public class Usuario {
    private ArrayList<Restricao> restricoes;

    public Usuario(){
        this.restricoes = new ArrayList<>();
    }

    public boolean temRestricao(Restricao restricao){
        for(Restricao r: restricoes){
			if(r.getCaracteristicaProibida() == restricao.getCaracteristicaProibida()){
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

    public boolean aceita(Receita receita){ //se uma receita é compatível com todas as restrições cadastradas
        for (Restricao restricao : restricoes){
            if (!restricao.permite(receita)) {
                return false;
            }
        }
        return true;
    }
}
