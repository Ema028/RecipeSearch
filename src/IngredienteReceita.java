package src;

public class IngredienteReceita {
    private Ingrediente ingrediente;
    private double quantidade;
    private String unidade;

    public IngredienteReceita(Ingrediente ingrediente, double quantidade, String unidade) {
        this.ingrediente = ingrediente;
        this.quantidade = quantidade;
        this.unidade = unidade;
    }

    public Ingrediente getIngrediente() {
        return ingrediente;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public String getUnidade() {
        return unidade;
    }
    
}
