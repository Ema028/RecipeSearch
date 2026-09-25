package src;

import java.util.ArrayList;

public abstract class Restricao{
    protected String nome;
    protected ArrayList<Caracteristica> caracteristicasProibidas;

    public Restricao(String nome){
        this.nome = nome;
        this.caracteristicasProibidas = new ArrayList<>();
	}

    public void adicionarProibicao(Caracteristica caracteristica){
        caracteristicasProibidas.add(caracteristica);
    }

    public abstract boolean permite(Receita receita);
} 