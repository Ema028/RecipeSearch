package classes;

import java.util.ArrayList;

import enums.Caracteristica;

public abstract class Restricao{
    protected String nome;
    protected ArrayList<Caracteristica> caracteristicasProibidas;

    public Restricao(){
        this.caracteristicasProibidas = new ArrayList<>();
	}

    public Restricao(Caracteristica... caracteristicas){
        this.caracteristicasProibidas = new ArrayList<>();
        for (Caracteristica c : caracteristicas) {
            this.adicionarProibicao(c);
        }
	}

    public void adicionarProibicao(Caracteristica caracteristica){
        caracteristicasProibidas.add(caracteristica);
    }

    public abstract boolean permite(Receita receita);

    @Override
    public boolean equals(Object o){
        if (this == o){
            return true;
        }
        if (o == null || getClass() != o.getClass()){
            return false;
        }
        Restricao restricao = (Restricao) o;
        return caracteristicasProibidas.equals(restricao.caracteristicasProibidas);
    }
} 