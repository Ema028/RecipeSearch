package src;

import java.util.ArrayList;

public class Ingrediente{
	private String nome;
	private ArrayList<Caracteristica> caracteristicas;

	public Ingrediente(String nome){
        this.nome = nome;
        this.caracteristicas = new ArrayList<>();
	}
	
	public boolean temCaracteristica(Caracteristica caracteristica){
<<<<<<< HEAD
        for(Caracteristica c: caracteristicas){
			if(c == caracteristica){
				return true;
			}
		}
		return false;
    }
=======
        	for(Caracteristica c: caracteristicas){
				if(c.equals(caracteristica)){
					return true;
			}
		}
		return false;
    	}
>>>>>>> master

	public void adicionarCaracteristica(Caracteristica caracteristica){
        	if (!temCaracteristica(caracteristica)){
            		caracteristicas.add(caracteristica);
        	}
    	}

	public String getNome(){
    	return nome;
	}

	public ArrayList<Caracteristica> getCaracteristicas() {
    	return caracteristicas;
	}
}
