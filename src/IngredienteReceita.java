package src;

public class IngredienteReceita {
    private Ingrediente ingrediente;
    private double quantidade;
    private String unidade;

    public IngredienteReceita(Ingrediente ingrediente, double quantidade, String unidade) {
        if (ingrediente == null){
            System.out.println("Erro: o ingrediente não pode ser nulo!");
        }
        if (quantidade <= 0){
            System.out.println("Erro: deve ser maior que zero!");
        }
        if (unidade == null){
            System.out.println("Erro: a unidade não pode ser nula!");
        }
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
