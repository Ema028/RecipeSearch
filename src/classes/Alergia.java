package classes;

import enums.Caracteristica;

public class Alergia extends Restricao{

    public Alergia(Caracteristica caracteristicaProibida) {
        super(caracteristicaProibida);
    }

    public boolean permite(Receita receita){
        if(receita.temCaracteristica(caracteristicaProibida)){
            return false;
        }
        return true;
    }
}
