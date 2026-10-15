package classes;

import enums.Caracteristica;

public class Dieta extends Restricao {
    protected Caracteristica caracteristicaDesejada;

    public Dieta(Caracteristica caracteristicaProibida, Caracteristica caracteristicasDesejada){
        super(caracteristicaProibida);
        this.caracteristicaDesejada=caracteristicasDesejada;
    }

    public boolean permite(Receita receita){
        if(receita.temCaracteristica(caracteristicaProibida)){
                return false;
        }

        if(receita.temCaracteristica(caracteristicaDesejada)){
            return true;
        }
        return false;
    }

}


