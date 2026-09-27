package classes;

import enums.Caracteristica;

public class Alergia extends Restricao{

    public boolean permite(Receita receita){
        for(Caracteristica i : caracteristicasProibidas){
            if(receita.temCaracteristica(i)){
                return false;
            }
        }
        return  true;
    }
}
