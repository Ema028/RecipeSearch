package src;

public class Ingrediente{
	private String nome;
	private ArrayList<Caracteristica> caracteristicas;
	
	public Ingrediente(String nome){
        	this.nome = nome;
        	this.caracteristicas = new ArrayList<>();
	}
}
