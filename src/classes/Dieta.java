package classes;

import enums.Caracteristica;

public class Dieta extends Restricao {
    protected Caracteristica caracteristicaDesejada;

    public Dieta(Caracteristica caracteristicasDesejada){
        this.caracteristicaDesejada=caracteristicasDesejada;
    }

    public boolean permite(Receita receita){
        for(Caracteristica i : caracteristicasProibidas){
            if(receita.temCaracteristica(i)){
                return false;
            }
        }
        if(receita.temCaracteristica(caracteristicaDesejada)){
            return true;
        }
        return false;
    }

}


