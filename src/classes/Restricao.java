package classes;

import enums.Caracteristica;

public abstract class Restricao{
    protected Caracteristica caracteristicaProibida;

    public Restricao(Caracteristica caracteristicaProibida){
        this.caracteristicaProibida = caracteristicaProibida;
	}

    public abstract boolean permite(Receita receita);

    public Caracteristica getCaracteristicaProibida() {
        return caracteristicaProibida;
    }
} 